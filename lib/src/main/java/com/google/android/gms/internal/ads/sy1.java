package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.core.app.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes.dex */
public final class sy1 extends v60 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f15594m;

    /* renamed from: n, reason: collision with root package name */
    private final xm1 f15595n;

    /* renamed from: o, reason: collision with root package name */
    private final ef0 f15596o;

    /* renamed from: p, reason: collision with root package name */
    private final jy1 f15597p;

    /* renamed from: q, reason: collision with root package name */
    private final ws2 f15598q;

    public sy1(Context context, jy1 jy1Var, ef0 ef0Var, xm1 xm1Var, ws2 ws2Var) {
        this.f15594m = context;
        this.f15595n = xm1Var;
        this.f15596o = ef0Var;
        this.f15597p = jy1Var;
        this.f15598q = ws2Var;
    }

    public static void M5(Context context, xm1 xm1Var, ws2 ws2Var, jy1 jy1Var, String str, String str2) {
        N5(context, xm1Var, ws2Var, jy1Var, str, str2, new HashMap());
    }

    public static void N5(Context context, xm1 xm1Var, ws2 ws2Var, jy1 jy1Var, String str, String str2, Map map) {
        String strB;
        String str3 = true != j3.t.q().x(context) ? "offline" : "online";
        if (((Boolean) k3.w.c().b(ir.Y7)).booleanValue() || xm1Var == null) {
            vs2 vs2VarB = vs2.b(str2);
            vs2VarB.a("gqi", str);
            vs2VarB.a("device_connectivity", str3);
            vs2VarB.a("event_timestamp", String.valueOf(j3.t.b().a()));
            for (Map.Entry entry : map.entrySet()) {
                vs2VarB.a((String) entry.getKey(), (String) entry.getValue());
            }
            strB = ws2Var.b(vs2VarB);
        } else {
            wm1 wm1VarA = xm1Var.a();
            wm1VarA.b("gqi", str);
            wm1VarA.b("action", str2);
            wm1VarA.b("device_connectivity", str3);
            wm1VarA.b("event_timestamp", String.valueOf(j3.t.b().a()));
            for (Map.Entry entry2 : map.entrySet()) {
                wm1VarA.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            strB = wm1VarA.f();
        }
        jy1Var.f(new ly1(j3.t.b().a(), str, strB, 2));
    }

    public static void O5(String[] strArr, int[] iArr, uy1 uy1Var) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                Activity activityA = uy1Var.a();
                xm1 xm1VarD = uy1Var.d();
                jy1 jy1VarE = uy1Var.e();
                ws2 ws2VarF = uy1Var.f();
                m3.t0 t0VarC = uy1Var.c();
                String strG = uy1Var.g();
                String strH = uy1Var.h();
                l3.r rVarB = uy1Var.b();
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", "confirm");
                    T5(activityA, t0VarC, jy1VarE, xm1VarD, ws2VarF, strG, strH);
                    U5(activityA, rVarB);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (rVarB != null) {
                        rVarB.b();
                    }
                }
                N5(activityA, xm1VarD, ws2VarF, jy1VarE, strG, "asnpdc", map);
                return;
            }
        }
    }

    static /* synthetic */ void P5(Activity activity, xm1 xm1Var, ws2 ws2Var, jy1 jy1Var, String str, m3.t0 t0Var, String str2, l3.r rVar, boolean z10, DialogInterface dialogInterface, int i10) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        N5(activity, xm1Var, ws2Var, jy1Var, str, "dialog_click", map);
        j3.t.r();
        if (androidx.core.app.o.e(activity).a()) {
            T5(activity, t0Var, jy1Var, xm1Var, ws2Var, str, str2);
            U5(activity, rVar);
        } else {
            if (Build.VERSION.SDK_INT < 33) {
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            M5(activity, xm1Var, ws2Var, jy1Var, str, "asnpdi");
            if (z10) {
                T5(activity, t0Var, jy1Var, xm1Var, ws2Var, str, str2);
            }
        }
    }

    public static void Q5(final Activity activity, final l3.r rVar, final m3.t0 t0Var, final jy1 jy1Var, final xm1 xm1Var, final ws2 ws2Var, final String str, final String str2, final boolean z10) {
        j3.t.r();
        AlertDialog.Builder builderF = m3.b2.f(activity);
        builderF.setTitle(R5(i3.b.f24296j, "Open ad when you're back online.")).setMessage(R5(i3.b.f24295i, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(R5(i3.b.f24292f, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.oy1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                sy1.P5(activity, xm1Var, ws2Var, jy1Var, str, t0Var, str2, rVar, z10, dialogInterface, i10);
            }
        }).setNegativeButton(R5(i3.b.f24294h, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.py1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                jy1 jy1Var2 = jy1Var;
                String str3 = str;
                Activity activity2 = activity;
                xm1 xm1Var2 = xm1Var;
                ws2 ws2Var2 = ws2Var;
                l3.r rVar2 = rVar;
                jy1Var2.e(str3);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                sy1.N5(activity2, xm1Var2, ws2Var2, jy1Var2, str3, "dialog_click", map);
                if (rVar2 != null) {
                    rVar2.b();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.qy1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                jy1 jy1Var2 = jy1Var;
                String str3 = str;
                Activity activity2 = activity;
                xm1 xm1Var2 = xm1Var;
                ws2 ws2Var2 = ws2Var;
                l3.r rVar2 = rVar;
                jy1Var2.e(str3);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                sy1.N5(activity2, xm1Var2, ws2Var2, jy1Var2, str3, "dialog_click", map);
                if (rVar2 != null) {
                    rVar2.b();
                }
            }
        });
        builderF.create().show();
    }

    private static String R5(int i10, String str) {
        Resources resourcesD = j3.t.q().d();
        return resourcesD == null ? str : resourcesD.getString(i10);
    }

    private final void S5(String str, String str2, Map map) {
        N5(this.f15594m, this.f15595n, this.f15598q, this.f15597p, str, str2, map);
    }

    private static void T5(Context context, m3.t0 t0Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var, String str, String str2) {
        try {
            if (t0Var.zzf(l4.b.p1(context), str2, str)) {
                return;
            }
        } catch (RemoteException e5) {
            ze0.e("Failed to schedule offline notification poster.", e5);
        }
        jy1Var.e(str);
        M5(context, xm1Var, ws2Var, jy1Var, str, "offline_notification_worker_not_scheduled");
    }

    private static void U5(Context context, final l3.r rVar) {
        String strR5 = R5(i3.b.f24293g, "You'll get a notification with the link when you're back online");
        j3.t.r();
        AlertDialog.Builder builderF = m3.b2.f(context);
        builderF.setMessage(strR5).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.ny1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                l3.r rVar2 = rVar;
                if (rVar2 != null) {
                    rVar2.b();
                }
            }
        });
        AlertDialog alertDialogCreate = builderF.create();
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new ry1(alertDialogCreate, timer, rVar), 3000L);
    }

    private static final PendingIntent V5(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return k03.a(context, 0, intent, k03.f10763a | 1073741824, 0);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void M0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zX = j3.t.q().x(this.f15594m);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zX ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f15594m;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            S5(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f15597p.getWritableDatabase();
                if (c == 1) {
                    this.f15597p.x(writableDatabase, this.f15596o, stringExtra2);
                } else {
                    jy1.U(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e5) {
                ze0.d("Failed to get writable offline buffering database: ".concat(e5.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        jy1 jy1Var = this.f15597p;
        final ef0 ef0Var = this.f15596o;
        jy1Var.g(new nr2() { // from class: com.google.android.gms.internal.ads.fy1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                jy1.c(ef0Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void j3(l4.a aVar, String str, String str2) {
        String str3;
        Context context = (Context) l4.b.L0(aVar);
        j3.t.s().f(context, "offline_notification_channel", "AdMob Offline Notifications");
        l.e eVarF = new l.e(context, "offline_notification_channel").p(R5(i3.b.f24291e, "View the ad you saved when you were offline")).o(R5(i3.b.f24290d, "Tap to open ad")).h(true).r(V5(context, "offline_notification_dismissed", str2, str)).n(V5(context, "offline_notification_clicked", str2, str)).F(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str2, 54321, eVarF.c());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e5) {
            map.put("notification_not_shown_reason", e5.getMessage());
            str3 = "offline_notification_failed";
        }
        S5(str2, str3, map);
    }
}
