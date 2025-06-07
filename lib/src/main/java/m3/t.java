package m3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.xp1;
import com.google.android.gms.internal.ads.ze0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25311a;

    /* renamed from: b, reason: collision with root package name */
    private final xp1 f25312b;

    /* renamed from: c, reason: collision with root package name */
    private String f25313c;

    /* renamed from: d, reason: collision with root package name */
    private String f25314d;

    /* renamed from: e, reason: collision with root package name */
    private String f25315e;

    /* renamed from: f, reason: collision with root package name */
    private String f25316f;

    /* renamed from: g, reason: collision with root package name */
    private int f25317g;

    /* renamed from: h, reason: collision with root package name */
    private int f25318h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f25319i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f25320j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f25321k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f25322l;

    public t(Context context) {
        this.f25317g = 0;
        this.f25322l = new Runnable() { // from class: m3.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f25284m.g();
            }
        };
        this.f25311a = context;
        this.f25318h = ViewConfiguration.get(context).getScaledTouchSlop();
        j3.t.v().b();
        this.f25321k = j3.t.v().a();
        this.f25312b = j3.t.u().a();
    }

    public t(Context context, String str) {
        this(context);
        this.f25313c = str;
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int iU = u(arrayList, "None", true);
        final int iU2 = u(arrayList, "Shake", true);
        final int iU3 = u(arrayList, "Flick", true);
        tp1 tp1Var = tp1.NONE;
        int iOrdinal = this.f25312b.a().ordinal();
        final int i10 = iOrdinal != 1 ? iOrdinal != 2 ? iU : iU3 : iU2;
        j3.t.r();
        AlertDialog.Builder builderF = b2.f(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderF.setTitle("Setup gesture");
        builderF.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: m3.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderF.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: m3.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f25251m.r();
            }
        });
        builderF.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: m3.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f25258m.h(atomicInteger, i10, iU2, iU3, dialogInterface, i11);
            }
        });
        builderF.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: m3.n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f25263m.r();
            }
        });
        builderF.create().show();
    }

    private final boolean t(float f5, float f10, float f11, float f12) {
        return Math.abs(this.f25319i.x - f5) < ((float) this.f25318h) && Math.abs(this.f25319i.y - f10) < ((float) this.f25318h) && Math.abs(this.f25320j.x - f11) < ((float) this.f25318h) && Math.abs(this.f25320j.y - f12) < ((float) this.f25318h);
    }

    private static final int u(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        s(this.f25311a);
    }

    final /* synthetic */ void b() {
        s(this.f25311a);
    }

    final /* synthetic */ void c(bb3 bb3Var) {
        if (j3.t.u().j(this.f25311a, this.f25314d, this.f25315e)) {
            bb3Var.execute(new Runnable() { // from class: m3.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25225m.b();
                }
            });
        } else {
            j3.t.u().d(this.f25311a, this.f25314d, this.f25315e);
        }
    }

    final /* synthetic */ void d(bb3 bb3Var) {
        if (j3.t.u().j(this.f25311a, this.f25314d, this.f25315e)) {
            bb3Var.execute(new Runnable() { // from class: m3.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25282m.f();
                }
            });
        } else {
            j3.t.u().d(this.f25311a, this.f25314d, this.f25315e);
        }
    }

    final /* synthetic */ void e() {
        j3.t.u().c(this.f25311a);
    }

    final /* synthetic */ void f() {
        j3.t.u().c(this.f25311a);
    }

    final /* synthetic */ void g() {
        this.f25317g = 4;
        r();
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        xp1 xp1Var;
        tp1 tp1Var;
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                xp1Var = this.f25312b;
                tp1Var = tp1.SHAKE;
            } else if (atomicInteger.get() == i12) {
                xp1Var = this.f25312b;
                tp1Var = tp1.FLICK;
            } else {
                xp1Var = this.f25312b;
                tp1Var = tp1.NONE;
            }
            xp1Var.k(tp1Var);
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i10) {
        j3.t.r();
        b2.o(this.f25311a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                ze0.b("Debug mode [Creative Preview] selected.");
                of0.f13186a.execute(new Runnable() { // from class: m3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25209m.l();
                    }
                });
                return;
            }
            if (i15 == i12) {
                ze0.b("Debug mode [Troubleshooting] selected.");
                of0.f13186a.execute(new Runnable() { // from class: m3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25228m.k();
                    }
                });
                return;
            }
            if (i15 == i13) {
                final bb3 bb3Var = of0.f13190e;
                bb3 bb3Var2 = of0.f13186a;
                if (this.f25312b.o()) {
                    bb3Var.execute(new Runnable() { // from class: m3.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25264m.e();
                        }
                    });
                    return;
                } else {
                    bb3Var2.execute(new Runnable() { // from class: m3.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25266m.d(bb3Var);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                final bb3 bb3Var3 = of0.f13190e;
                bb3 bb3Var4 = of0.f13186a;
                if (this.f25312b.o()) {
                    bb3Var3.execute(new Runnable() { // from class: m3.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25236m.a();
                        }
                    });
                    return;
                } else {
                    bb3Var4.execute(new Runnable() { // from class: m3.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25238m.c(bb3Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f25311a instanceof Activity)) {
            ze0.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f25313c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            j3.t.r();
            Map mapK = b2.k(uriBuild);
            for (String str3 : mapK.keySet()) {
                sb2.append(str3);
                sb2.append(" = ");
                sb2.append((String) mapK.get(str3));
                sb2.append("\n\n");
            }
            String strTrim = sb2.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        j3.t.r();
        AlertDialog.Builder builderF = b2.f(this.f25311a);
        builderF.setMessage(str2);
        builderF.setTitle("Ad Information");
        builderF.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: m3.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
                this.f25211m.i(str2, dialogInterface2, i16);
            }
        });
        builderF.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: m3.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
            }
        });
        builderF.create().show();
    }

    final /* synthetic */ void k() {
        x xVarU = j3.t.u();
        Context context = this.f25311a;
        String str = this.f25314d;
        String str2 = this.f25315e;
        String str3 = this.f25316f;
        boolean zM = xVarU.m();
        xVarU.h(xVarU.j(context, str, str2));
        if (!xVarU.m()) {
            xVarU.d(context, str, str2);
            return;
        }
        if (!zM && !TextUtils.isEmpty(str3)) {
            xVarU.e(context, str2, str3, str);
        }
        ze0.b("Device is linked for debug signals.");
        xVarU.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        x xVarU = j3.t.u();
        Context context = this.f25311a;
        String str = this.f25314d;
        String str2 = this.f25315e;
        if (!xVarU.k(context, str, str2)) {
            xVarU.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(xVarU.f25344f)) {
            ze0.b("Creative is not pushed for this device.");
            xVarU.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(xVarU.f25344f)) {
            ze0.b("The app is not linked for creative preview.");
            xVarU.d(context, str, str2);
        } else if ("0".equals(xVarU.f25344f)) {
            ze0.b("Device is linked for in app preview.");
            xVarU.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f25317g = 0;
            this.f25319i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f25317g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f25317g = 5;
                this.f25320j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f25321k.postDelayed(this.f25322l, ((Long) k3.w.c().b(ir.f10037o4)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !t(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f25317g = -1;
            this.f25321k.removeCallbacks(this.f25322l);
        }
    }

    public final void n(String str) {
        this.f25314d = str;
    }

    public final void o(String str) {
        this.f25315e = str;
    }

    public final void p(String str) {
        this.f25313c = str;
    }

    public final void q(String str) {
        this.f25316f = str;
    }

    public final void r() {
        try {
            if (!(this.f25311a instanceof Activity)) {
                ze0.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(j3.t.u().b())) {
                str = "Creative preview";
            }
            String str2 = true != j3.t.u().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iU = u(arrayList, "Ad information", true);
            final int iU2 = u(arrayList, str, true);
            final int iU3 = u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) k3.w.c().b(ir.A8)).booleanValue();
            final int iU4 = u(arrayList, "Open ad inspector", zBooleanValue);
            final int iU5 = u(arrayList, "Ad inspector settings", zBooleanValue);
            j3.t.r();
            AlertDialog.Builder builderF = b2.f(this.f25311a);
            builderF.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: m3.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f25270m.j(iU, iU2, iU3, iU4, iU5, dialogInterface, i10);
                }
            });
            builderF.create().show();
        } catch (WindowManager.BadTokenException e5) {
            n1.l("", e5);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f25313c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f25316f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f25315e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f25314d);
        sb2.append("}");
        return sb2.toString();
    }
}
