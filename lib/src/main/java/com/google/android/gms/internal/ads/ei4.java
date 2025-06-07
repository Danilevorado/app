package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
final class ei4 implements ql4, vg4 {

    /* renamed from: b, reason: collision with root package name */
    private final Uri f7811b;

    /* renamed from: c, reason: collision with root package name */
    private final zx3 f7812c;

    /* renamed from: d, reason: collision with root package name */
    private final yh4 f7813d;

    /* renamed from: e, reason: collision with root package name */
    private final n f7814e;

    /* renamed from: f, reason: collision with root package name */
    private final jw1 f7815f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f7817h;

    /* renamed from: j, reason: collision with root package name */
    private long f7819j;

    /* renamed from: l, reason: collision with root package name */
    private s0 f7821l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7822m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ji4 f7823n;

    /* renamed from: g, reason: collision with root package name */
    private final l0 f7816g = new l0();

    /* renamed from: i, reason: collision with root package name */
    private boolean f7818i = true;

    /* renamed from: a, reason: collision with root package name */
    private final long f7810a = xg4.a();

    /* renamed from: k, reason: collision with root package name */
    private ib3 f7820k = i(0);

    public ei4(ji4 ji4Var, Uri uri, t53 t53Var, yh4 yh4Var, n nVar, jw1 jw1Var) {
        this.f7823n = ji4Var;
        this.f7811b = uri;
        this.f7812c = new zx3(t53Var);
        this.f7813d = yh4Var;
        this.f7814e = nVar;
        this.f7815f = jw1Var;
    }

    static /* bridge */ /* synthetic */ void f(ei4 ei4Var, long j10, long j11) {
        ei4Var.f7816g.f11275a = j10;
        ei4Var.f7819j = j11;
        ei4Var.f7818i = true;
        ei4Var.f7822m = false;
    }

    private final ib3 i(long j10) {
        g93 g93Var = new g93();
        g93Var.d(this.f7811b);
        g93Var.c(j10);
        g93Var.a(6);
        g93Var.b(ji4.X);
        return g93Var.e();
    }

    @Override // com.google.android.gms.internal.ads.vg4
    public final void a(jm2 jm2Var) {
        long jMax = !this.f7822m ? this.f7819j : Math.max(ji4.O(this.f7823n, true), this.f7819j);
        int i10 = jm2Var.i();
        s0 s0Var = this.f7821l;
        Objects.requireNonNull(s0Var);
        q0.b(s0Var, jm2Var, i10);
        s0Var.e(jMax, 1, i10, 0, null);
        this.f7822m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[LOOP:0: B:3:0x0004->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7 A[EDGE_INSN: B:130:0x01c7->B:84:0x01c7 BREAK  A[LOOP:1: B:72:0x0184->B:133:0x0184], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:123:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a A[Catch: all -> 0x01e9, TryCatch #5 {all -> 0x01e9, blocks: (B:59:0x015f, B:61:0x016a, B:62:0x016f, B:64:0x0173), top: B:119:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173 A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #5 {all -> 0x01e9, blocks: (B:59:0x015f, B:61:0x016a, B:62:0x016f, B:64:0x0173), top: B:119:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc  */
    @Override // com.google.android.gms.internal.ads.ql4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ei4.g():void");
    }

    @Override // com.google.android.gms.internal.ads.ql4
    public final void h() {
        this.f7817h = true;
    }
}
