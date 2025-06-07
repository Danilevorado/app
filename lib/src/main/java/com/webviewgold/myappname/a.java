package com.webviewgold.myappname;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import androidx.appcompat.app.b;

/* loaded from: classes2.dex */
abstract class a {

    /* renamed from: com.webviewgold.myappname.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnClickListenerC0115a implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f22724m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f22725n;

        DialogInterfaceOnClickListenerC0115a(Context context, SharedPreferences.Editor editor) {
            this.f22724m = context;
            this.f22725n = editor;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f22724m.getPackageName()));
            intent.addFlags(1208483840);
            try {
                this.f22724m.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                this.f22724m.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this.f22724m.getPackageName())));
            }
            this.f22725n.putBoolean("don't_show_again_rater", true);
            this.f22725n.apply();
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f22726m;

        b(SharedPreferences.Editor editor) {
            this.f22726m = editor;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f22726m.putBoolean("don't_show_again_rater", true);
            this.f22726m.apply();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f22727m;

        c(SharedPreferences.Editor editor) {
            this.f22727m = editor;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f22727m.putBoolean("don't_show_again_facebook", true);
            this.f22727m.apply();
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f22728m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f22729n;

        d(Context context, SharedPreferences.Editor editor) {
            this.f22728m = context;
            this.f22729n = editor;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/OnlineAppCreator/"));
            intent.addFlags(1208483840);
            this.f22728m.startActivity(intent);
            this.f22729n.putBoolean("don't_show_again_facebook", true);
            this.f22729n.apply();
        }
    }

    public static void a(Context context) {
        boolean z10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("rate_prefs", 0);
        boolean z11 = sharedPreferences.getBoolean("don't_show_again_rater", false);
        boolean z12 = sharedPreferences.getBoolean("don't_show_again_facebook", false);
        if (z11 && z12) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        long jCurrentTimeMillis = sharedPreferences.getLong("first_launch_date", 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            editorEdit.putLong("first_launch_date", jCurrentTimeMillis);
            if (e.f22746m) {
                g(context);
            }
        }
        if (z11) {
            z10 = false;
        } else {
            int i10 = sharedPreferences.getInt("launched_count_rate", 0) + 1;
            z10 = i10 >= 3 && System.currentTimeMillis() >= 259200000 + jCurrentTimeMillis;
            if (z10) {
                if (e.f22748o) {
                    h(context);
                }
                editorEdit.putInt("launched_count_rate", 0);
            } else {
                editorEdit.putInt("launched_count_rate", i10);
            }
        }
        if (!z12) {
            int i11 = sharedPreferences.getInt("launched_count_facebook", 0) + 1;
            if (z10 || i11 < 4 || System.currentTimeMillis() < jCurrentTimeMillis + 172800000) {
                editorEdit.putInt("launched_count_facebook", i11);
            } else {
                if (e.f22747n) {
                    f(context);
                }
                editorEdit.putInt("launched_count_facebook", 0);
            }
        }
        editorEdit.apply();
    }

    public static String b(Context context, String str) {
        return context.getSharedPreferences("rate_prefs", 0).getString("FirebaseToken", str);
    }

    private static SharedPreferences c(Context context) {
        return context.getSharedPreferences("purchase_prefs", 0);
    }

    public static boolean d(Context context) {
        return c(context).getBoolean("purchased", false);
    }

    public static void e(Context context, boolean z10) {
        c(context).edit().putBoolean("purchased", z10).apply();
    }

    private static void f(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("rate_prefs", 0).edit();
        new b.a(context, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar).r(com.facebook.ads.R.string.facebook_title).g(com.facebook.ads.R.string.facebook_message).o(com.facebook.ads.R.string.yes, new d(context, editorEdit)).k(com.facebook.ads.R.string.later, null).i(com.facebook.ads.R.string.no, new c(editorEdit)).a().show();
    }

    private static void g(Context context) {
        new b.a(context, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar).r(com.facebook.ads.R.string.first_launch_title).g(com.facebook.ads.R.string.first_launch_message).o(R.string.ok, null).a().show();
    }

    private static void h(Context context) {
        Resources resources = context.getResources();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("rate_prefs", 0).edit();
        new b.a(context, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar).s(resources.getString(com.facebook.ads.R.string.rate_title)).h(resources.getString(com.facebook.ads.R.string.rate_message)).j(resources.getString(com.facebook.ads.R.string.no), new b(editorEdit)).l(resources.getString(com.facebook.ads.R.string.later), null).p(resources.getString(com.facebook.ads.R.string.rate), new DialogInterfaceOnClickListenerC0115a(context, editorEdit)).a().show();
    }

    public static void i(Context context, String str) {
        context.getSharedPreferences("rate_prefs", 0).edit().putString("FirebaseToken", str).apply();
    }
}
