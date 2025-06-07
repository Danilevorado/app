package y3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e4.p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f28532c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f28533d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f28534a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f28535b;

    a(Context context) {
        this.f28535b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        p.l(context);
        Lock lock = f28532c;
        lock.lock();
        try {
            if (f28533d == null) {
                f28533d = new a(context.getApplicationContext());
            }
            a aVar = f28533d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f28532c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.F(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f28534a.lock();
        try {
            return this.f28535b.getString(str, null);
        } finally {
            this.f28534a.unlock();
        }
    }
}
