package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Set;

/* loaded from: classes.dex */
public final class h60 extends n60 {

    /* renamed from: u, reason: collision with root package name */
    static final Set f9015u = i4.f.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c, reason: collision with root package name */
    private String f9016c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9017d;

    /* renamed from: e, reason: collision with root package name */
    private int f9018e;

    /* renamed from: f, reason: collision with root package name */
    private int f9019f;

    /* renamed from: g, reason: collision with root package name */
    private int f9020g;

    /* renamed from: h, reason: collision with root package name */
    private int f9021h;

    /* renamed from: i, reason: collision with root package name */
    private int f9022i;

    /* renamed from: j, reason: collision with root package name */
    private int f9023j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f9024k;

    /* renamed from: l, reason: collision with root package name */
    private final nk0 f9025l;

    /* renamed from: m, reason: collision with root package name */
    private final Activity f9026m;

    /* renamed from: n, reason: collision with root package name */
    private em0 f9027n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f9028o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f9029p;

    /* renamed from: q, reason: collision with root package name */
    private final o60 f9030q;

    /* renamed from: r, reason: collision with root package name */
    private PopupWindow f9031r;

    /* renamed from: s, reason: collision with root package name */
    private RelativeLayout f9032s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f9033t;

    public h60(nk0 nk0Var, o60 o60Var) {
        super(nk0Var, "resize");
        this.f9016c = "top-right";
        this.f9017d = true;
        this.f9018e = 0;
        this.f9019f = 0;
        this.f9020g = -1;
        this.f9021h = 0;
        this.f9022i = 0;
        this.f9023j = -1;
        this.f9024k = new Object();
        this.f9025l = nk0Var;
        this.f9026m = nk0Var.i();
        this.f9030q = o60Var;
    }

    public final void h(boolean z10) {
        synchronized (this.f9024k) {
            PopupWindow popupWindow = this.f9031r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f9032s.removeView((View) this.f9025l);
                ViewGroup viewGroup = this.f9033t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f9028o);
                    this.f9033t.addView((View) this.f9025l);
                    this.f9025l.c1(this.f9027n);
                }
                if (z10) {
                    g("default");
                    o60 o60Var = this.f9030q;
                    if (o60Var != null) {
                        o60Var.b();
                    }
                }
                this.f9031r = null;
                this.f9032s = null;
                this.f9033t = null;
                this.f9029p = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0251 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:210:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0258 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:210:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e3 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:210:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h60.i(java.util.Map):void");
    }

    public final void j(int i10, int i11, boolean z10) {
        synchronized (this.f9024k) {
            this.f9018e = i10;
            this.f9019f = i11;
        }
    }

    public final void k(int i10, int i11) {
        this.f9018e = i10;
        this.f9019f = i11;
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f9024k) {
            z10 = this.f9031r != null;
        }
        return z10;
    }
}
