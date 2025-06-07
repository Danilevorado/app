package l3;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.se0;

/* loaded from: classes.dex */
public final class w extends FrameLayout implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    private final ImageButton f25101m;

    /* renamed from: n, reason: collision with root package name */
    private final e f25102n;

    public w(Context context, v vVar, e eVar) throws Resources.NotFoundException {
        super(context);
        this.f25102n = eVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f25101m = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        k3.t.b();
        int iZ = se0.z(context, vVar.f25097a);
        k3.t.b();
        int iZ2 = se0.z(context, 0);
        k3.t.b();
        int iZ3 = se0.z(context, vVar.f25098b);
        k3.t.b();
        imageButton.setPadding(iZ, iZ2, iZ3, se0.z(context, vVar.f25099c));
        imageButton.setContentDescription("Interstitial close button");
        k3.t.b();
        int iZ4 = se0.z(context, vVar.f25100d + vVar.f25097a + vVar.f25098b);
        k3.t.b();
        addView(imageButton, new FrameLayout.LayoutParams(iZ4, se0.z(context, vVar.f25100d + vVar.f25099c), 17));
        long jLongValue = ((Long) k3.w.c().b(ir.Y0)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        u uVar = ((Boolean) k3.w.c().b(ir.Z0)).booleanValue() ? new u(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.X0
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = i4.m.f()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L67
        L24:
            com.google.android.gms.internal.ads.je0 r1 = j3.t.q()
            android.content.res.Resources r1 = r1.d()
            if (r1 == 0) goto L61
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r4 == 0) goto L3e
            int r0 = i3.a.f24286b     // Catch: android.content.res.Resources.NotFoundException -> L49
        L39:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L4e
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r0 == 0) goto L4e
            int r0 = i3.a.f24285a     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L39
        L49:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.internal.ads.ze0.b(r0)
        L4e:
            android.widget.ImageButton r0 = r5.f25101m
            if (r3 != 0) goto L56
            r0.setImageResource(r2)
            return
        L56:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.f25101m
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L61:
            android.widget.ImageButton r0 = r5.f25101m
            r0.setImageResource(r2)
            return
        L67:
            android.widget.ImageButton r0 = r5.f25101m
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.w.c():void");
    }

    public final void b(boolean z10) {
        if (!z10) {
            this.f25101m.setVisibility(0);
            return;
        }
        this.f25101m.setVisibility(8);
        if (((Long) k3.w.c().b(ir.Y0)).longValue() > 0) {
            this.f25101m.animate().cancel();
            this.f25101m.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = this.f25102n;
        if (eVar != null) {
            eVar.i();
        }
    }
}
