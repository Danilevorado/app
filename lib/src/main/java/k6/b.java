package k6;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f24841c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24842a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24843b;

    public b(v5.d dVar) {
        this.f24842a = dVar.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f24843b = b(dVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(v5.d dVar) {
        String strC = dVar.m().c();
        if (strC != null) {
            return strC;
        }
        String strB = dVar.m().b();
        if (!strB.startsWith("1:") && !strB.startsWith("2:")) {
            return strB;
        }
        String[] strArrSplit = strB.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e5) {
            Log.w("ContentValues", "Invalid key stored " + e5);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f24842a) {
            string = this.f24842a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f24842a) {
            String string = this.f24842a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    public String f() {
        synchronized (this.f24842a) {
            String strG = g();
            if (strG != null) {
                return strG;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f24842a) {
            for (String str : f24841c) {
                String string = this.f24842a.getString(a(this.f24843b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
