package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;

/* loaded from: classes.dex */
abstract class z {

    class a implements Runnable {

        /* renamed from: com.onesignal.z$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0113a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0113a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                n3.j(n3.f22119a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Activity f22537m;

            b(Activity activity) {
                this.f22537m = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) throws PendingIntent.CanceledException {
                z.a(this.f22537m);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityT = e3.T();
            if (activityT == null) {
                return;
            }
            String strK = OSUtils.k(activityT, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String strK2 = OSUtils.k(activityT, "onesignal_gms_missing_alert_button_update", "Update");
            String strK3 = OSUtils.k(activityT, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(activityT).setMessage(strK).setPositiveButton(strK2, new b(activityT)).setNegativeButton(strK3, new DialogInterfaceOnClickListenerC0113a()).setNeutralButton(OSUtils.k(activityT, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Activity activity) throws PendingIntent.CanceledException {
        try {
            b4.e eVarP = b4.e.p();
            PendingIntent pendingIntentE = eVarP.e(activity, eVarP.i(e3.f21882e), 9000);
            if (pendingIntentE != null) {
                pendingIntentE.send();
            }
        } catch (PendingIntent.CanceledException e5) {
            e5.printStackTrace();
        }
    }

    private static boolean c() {
        x xVarA = t3.f22451a.a(e3.f21882e, "com.google.android.gms", 128);
        if (!xVarA.b() || xVarA.a() == null) {
            return false;
        }
        return !((String) xVarA.a().applicationInfo.loadLabel(e3.f21882e.getPackageManager())).equals("Market");
    }

    static void d() {
        if (OSUtils.B() && c() && !e3.b0() && !n3.b(n3.f22119a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.S(new a());
        }
    }
}
