package a4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f156a;

    /* renamed from: b, reason: collision with root package name */
    private int f157b;

    /* renamed from: c, reason: collision with root package name */
    private int f158c = 0;

    public y(Context context) {
        this.f156a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoF;
        if (this.f157b == 0) {
            try {
                packageInfoF = k4.c.a(this.f156a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e5) {
                String strValueOf = String.valueOf(e5);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(strValueOf);
                Log.w("Metadata", sb2.toString());
                packageInfoF = null;
            }
            if (packageInfoF != null) {
                this.f157b = packageInfoF.versionCode;
            }
        }
        return this.f157b;
    }

    public final synchronized int b() {
        int i10 = this.f158c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f156a.getPackageManager();
        if (k4.c.a(this.f156a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!i4.m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f158c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f158c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (i4.m.i()) {
            this.f158c = 2;
            i11 = 2;
        } else {
            this.f158c = 1;
        }
        return i11;
    }
}
