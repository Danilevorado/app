package b4;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.l;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c, reason: collision with root package name */
    private String f4417c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f4415e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final e f4416f = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final int f4414d = f.f4422a;

    public static e p() {
        return f4416f;
    }

    @Override // b4.f
    public Intent d(Context context, int i10, String str) {
        return super.d(context, i10, str);
    }

    @Override // b4.f
    public PendingIntent e(Context context, int i10, int i11) {
        return super.e(context, i10, i11);
    }

    @Override // b4.f
    public final String g(int i10) {
        return super.g(i10);
    }

    @Override // b4.f
    public int i(Context context) {
        return super.i(context);
    }

    @Override // b4.f
    public int j(Context context, int i10) {
        return super.j(context, i10);
    }

    @Override // b4.f
    public final boolean m(int i10) {
        return super.m(i10);
    }

    public Dialog n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return s(activity, i10, e4.d0.b(activity, d(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent o(Context context, b bVar) {
        return bVar.x() ? bVar.v() : e(context, bVar.f(), 0);
    }

    public boolean q(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogN = n(activity, i10, i11, onCancelListener);
        if (dialogN == null) {
            return false;
        }
        v(activity, dialogN, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void r(Context context, int i10) throws Resources.NotFoundException {
        w(context, i10, null, f(context, i10, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog s(Context context, int i10, e4.d0 d0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(e4.a0.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = e4.a0.b(context, i10);
        if (strB != null) {
            if (d0Var == null) {
                d0Var = onClickListener;
            }
            builder.setPositiveButton(strB, d0Var);
        }
        String strF = e4.a0.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(e4.a0.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        v(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final d4.u u(Context context, d4.t tVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        d4.u uVar = new d4.u(tVar);
        p4.f.n(context, uVar, intentFilter);
        uVar.a(context);
        if (l(context, "com.google.android.gms")) {
            return uVar;
        }
        tVar.a();
        uVar.b();
        return null;
    }

    final void v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                l.b2(dialog, onCancelListener).a2(((androidx.fragment.app.e) activity).H(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void w(Context context, int i10, String str, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = e4.a0.e(context, i10);
        String strD = e4.a0.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) e4.p.l(context.getSystemService("notification"));
        l.e eVarH = new l.e(context).z(true).h(true).p(strE).H(new l.c().h(strD));
        if (i4.i.f(context)) {
            e4.p.o(i4.m.e());
            eVarH.F(context.getApplicationInfo().icon).D(2);
            if (i4.i.g(context)) {
                eVarH.a(z3.a.f28855a, resources.getString(z3.b.f28870o), pendingIntent);
            } else {
                eVarH.n(pendingIntent);
            }
        } else {
            eVarH.F(R.drawable.stat_sys_warning).I(resources.getString(z3.b.f28863h)).L(System.currentTimeMillis()).n(pendingIntent).o(strD);
        }
        if (i4.m.i()) {
            e4.p.o(i4.m.i());
            synchronized (f4415e) {
                str2 = this.f4417c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(z3.b.f28862g);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            eVarH.j(str2);
        }
        Notification notificationC = eVarH.c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            i.f4428b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationC);
    }

    final void x(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean y(Activity activity, d4.f fVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogS = s(activity, i10, e4.d0.c(fVar, d(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogS == null) {
            return false;
        }
        v(activity, dialogS, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean z(Context context, b bVar, int i10) throws Resources.NotFoundException {
        PendingIntent pendingIntentO;
        if (k4.a.a(context) || (pendingIntentO = o(context, bVar)) == null) {
            return false;
        }
        w(context, bVar.f(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentO, i10, true), p4.g.f25921a | 134217728));
        return true;
    }
}
