package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nk extends Thread {
    private final boolean A;
    private final boolean B;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12673m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12674n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f12675o;

    /* renamed from: p, reason: collision with root package name */
    private final ek f12676p;

    /* renamed from: q, reason: collision with root package name */
    private final int f12677q;

    /* renamed from: r, reason: collision with root package name */
    private final int f12678r;

    /* renamed from: s, reason: collision with root package name */
    private final int f12679s;

    /* renamed from: t, reason: collision with root package name */
    private final int f12680t;

    /* renamed from: u, reason: collision with root package name */
    private final int f12681u;

    /* renamed from: v, reason: collision with root package name */
    private final int f12682v;

    /* renamed from: w, reason: collision with root package name */
    private final int f12683w;

    /* renamed from: x, reason: collision with root package name */
    private final int f12684x;

    /* renamed from: y, reason: collision with root package name */
    private final String f12685y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f12686z;

    public nk() {
        ek ekVar = new ek();
        this.f12673m = false;
        this.f12674n = false;
        this.f12676p = ekVar;
        this.f12675o = new Object();
        this.f12678r = ((Long) us.f16435d.e()).intValue();
        this.f12679s = ((Long) us.f16432a.e()).intValue();
        this.f12680t = ((Long) us.f16436e.e()).intValue();
        this.f12681u = ((Long) us.f16434c.e()).intValue();
        this.f12682v = ((Integer) k3.w.c().b(ir.S)).intValue();
        this.f12683w = ((Integer) k3.w.c().b(ir.T)).intValue();
        this.f12684x = ((Integer) k3.w.c().b(ir.U)).intValue();
        this.f12677q = ((Long) us.f16437f.e()).intValue();
        this.f12685y = (String) k3.w.c().b(ir.W);
        this.f12686z = ((Boolean) k3.w.c().b(ir.X)).booleanValue();
        this.A = ((Boolean) k3.w.c().b(ir.Y)).booleanValue();
        this.B = ((Boolean) k3.w.c().b(ir.Z)).booleanValue();
        setName("ContentFetchTask");
    }

    public final dk a() {
        return this.f12676p.a(this.B);
    }

    final mk b(View view, dk dkVar) {
        if (view == null) {
            return new mk(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new mk(this, 0, 0);
            }
            dkVar.k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new mk(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof nk0)) {
            WebView webView = (WebView) view;
            if (!i4.m.d()) {
                return new mk(this, 0, 0);
            }
            dkVar.h();
            webView.post(new lk(this, dkVar, webView, globalVisibleRect));
            return new mk(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new mk(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            mk mkVarB = b(viewGroup.getChildAt(i12), dkVar);
            i10 += mkVarB.f12178a;
            i11 += mkVarB.f12179b;
        }
        return new mk(this, i10, i11);
    }

    final void c(View view) {
        try {
            dk dkVar = new dk(this.f12678r, this.f12679s, this.f12680t, this.f12681u, this.f12682v, this.f12683w, this.f12684x, this.A);
            Context contextB = j3.t.d().b();
            if (contextB != null && !TextUtils.isEmpty(this.f12685y)) {
                String str = (String) view.getTag(contextB.getResources().getIdentifier((String) k3.w.c().b(ir.V), "id", contextB.getPackageName()));
                if (str != null && str.equals(this.f12685y)) {
                    return;
                }
            }
            mk mkVarB = b(view, dkVar);
            dkVar.m();
            if (mkVarB.f12178a == 0 && mkVarB.f12179b == 0) {
                return;
            }
            int i10 = mkVarB.f12179b;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.f12676p.b(dkVar);
            } else if (dkVar.c() == 0) {
                return;
            }
            if (this.f12676p.d(dkVar)) {
                return;
            }
            this.f12676p.b(dkVar);
        } catch (Exception e5) {
            ze0.e("Exception in fetchContentOnUIThread", e5);
            j3.t.q().u(e5, "ContentFetchTask.fetchContent");
        }
    }

    final void d(dk dkVar, WebView webView, String str, boolean z10) {
        dkVar.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f12686z || TextUtils.isEmpty(webView.getTitle())) {
                    dkVar.l(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    dkVar.l(webView.getTitle() + "\n" + strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (dkVar.o()) {
                this.f12676p.c(dkVar);
            }
        } catch (JSONException unused) {
            ze0.b("Json string may be malformed.");
        } catch (Throwable th) {
            ze0.c("Failed to get webview content.", th);
            j3.t.q().u(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.f12675o) {
            if (this.f12673m) {
                ze0.b("Content hash thread already started, quitting...");
            } else {
                this.f12673m = true;
                start();
            }
        }
    }

    public final void f() {
        synchronized (this.f12675o) {
            this.f12674n = true;
            ze0.b("ContentFetchThread: paused, pause = true");
        }
    }

    public final void g() {
        synchronized (this.f12675o) {
            this.f12674n = false;
            this.f12675o.notifyAll();
            ze0.b("ContentFetchThread: wakeup");
        }
    }

    public final boolean h() {
        return this.f12674n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = j3.t.d().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        com.google.android.gms.internal.ads.ze0.b("ContentFetchThread: no activity. Sleeping.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        j3.t.q().u(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.ze0.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        com.google.android.gms.internal.ads.ze0.e("Error in ContentFetchTask", r0);
        j3.t.q().u(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        com.google.android.gms.internal.ads.ze0.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00da->B:71:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.ik r0 = j3.t.d()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.b()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.ik r0 = j3.t.d()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            android.app.Activity r0 = r0.a()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.ze0.b(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L69:
            r6.f()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.je0 r2 = j3.t.q()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.u(r0, r3)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.ze0.b(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L9d:
            if (r1 == 0) goto Lb8
            com.google.android.gms.internal.ads.jk r0 = new com.google.android.gms.internal.ads.jk     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r1.post(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.je0 r1 = j3.t.q()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.u(r0, r2)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.ze0.b(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto L69
        Lb8:
            int r0 = r6.f12677q     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Ld7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.ze0.e(r1, r0)
            java.lang.String r1 = "ContentFetchTask.run"
            com.google.android.gms.internal.ads.je0 r2 = j3.t.q()
            r2.u(r0, r1)
            goto Ld7
        Ld1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.ze0.e(r1, r0)
        Ld7:
            java.lang.Object r0 = r6.f12675o
            monitor-enter(r0)
        Lda:
            boolean r1 = r6.f12674n     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le9
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.ze0.b(r1)     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            java.lang.Object r1 = r6.f12675o     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            r1.wait()     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            goto Lda
        Le9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            goto L0
        Lec:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nk.run():void");
    }
}
