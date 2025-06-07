package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class zf extends yf {
    protected static final Object L = new Object();
    private static final String M = "zf";
    static boolean N = false;
    private static long O;
    private static fg P;
    private static nh Q;
    private static eh R;
    protected boolean H;
    protected final String I;
    lh J;
    private final Map K;

    protected zf(Context context, String str, boolean z10) {
        super(context);
        this.H = false;
        this.K = new HashMap();
        this.I = str;
        this.H = z10;
    }

    protected static dh p(Context context, boolean z10) {
        if (yf.G == null) {
            synchronized (L) {
                if (yf.G == null) {
                    dh dhVarG = dh.g(context, "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", z10);
                    if (dhVarG.r()) {
                        try {
                            if (((Boolean) k3.w.c().b(ir.P2)).booleanValue()) {
                                dhVarG.t("hunjs8A/5DNYOOAMFalGgcT5i4IxfyPvlvtXNFOaD034Wz4GSxVvrwBSs7k+Xuhr", "SWC7heB+iJvjMtyDTDnMRbHSVyBQ/kwwuxCjVwpzEBg=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        dhVarG.t("Nh+w10G1n7Da4ABjUIxN+bi57DvusNUcn9VqpF1GXimOuh+Booa8zjDH+Fzh+CdP", "2aR451s+WavC28PZAI1OicYdxdf9H8e1m2qQ6Vd7HNY=", Context.class);
                        dhVarG.t("gRiEqMdygJbXVwKGpJJS0XfYaGpCoNDcsHcIyHSZIcdpg+a2r1SI+bnO9R0NWRI0", "EBqSzSIe3Rjv1o1jIB+xCBngdhv60cOxeintd9wp68g=", Context.class);
                        dhVarG.t("Jdw9xFuo4OHuL+Waf9VEkBs6M7XtRhuX3PknFoicWEjQXQ4CENXY5MXEEK1WPoR/", "NFKyR+VbXbtroBTvca7ACsz/BEp9N5Lv9/EMVuAgXOo=", Context.class);
                        dhVarG.t("9Ibp0iX8frxcDol5LCDOary7OEblvzOEr0WtPn69zRxHnh2qqHn8v0kanoAZtnND", "icVSPKCsokOqk/nN9ldgEGzs48x1unFAjrOT1dBDO7k=", Context.class);
                        dhVarG.t("I+xlh/5GUzBsQHWA4Anrxm/J1H2aa2zRtcwvegQCTHllS1Tl5YGYaDcQHq23j0mf", "i/S3Ms1xTrAJGHFn1omMI5XPFfDzyhz5oaagmOhDNQg=", Context.class);
                        Class cls = Boolean.TYPE;
                        dhVarG.t("/eWSSnmYTOwLgnyjztZ17bt5eITOkf8Wjh78RPrx7GUZwaLGo/MX2SyicRamXiG+", "tvpwr35XXUfFfc9l/XoM3WDKfcmrAeKjBJbIgi/9trQ=", Context.class, cls);
                        dhVarG.t("7sn4HHbUg+T4b9n1KPrutL8tcrilMYlvs7RJQ5pmfB/1m2qwJzRoxivnCVXu/U+z", "apLnpmRDpCfdu10ORTmQ+sdRCmiB4EA8hGSHUeA9nD0=", Context.class);
                        dhVarG.t("kwtXYBCvBLfWcikGQlC0YCCiAi3jf0v8mKFP3Rqx70Jf0cytKZO4qWHMAffIVrkU", "nMO31gtWkn27JzpwW/zLPiiIPhLCWt7BVghY/Hyr+TE=", Context.class);
                        dhVarG.t("Tw8s+i46jU7h4eAAIyqjRm6Qx2s08AiuQFiQiAnvTc/m6i7qS69Zqr0xce6FwG0s", "dBvoahw90QxEayGvM7wPL8uyGyjAlcLulgarkCbJ360=", MotionEvent.class, DisplayMetrics.class);
                        dhVarG.t("5kaSofNlVXtCUNlGdVeQWvaOP7NTIA28WhQGVqYMr2+1W5DIZ4rAeif/Ixnxac6c", "6DjMpZpwaW5op66Lef2rZgfmub82/L76U+lowNvybUI=", MotionEvent.class, DisplayMetrics.class);
                        dhVarG.t("GZmNPeawNfdnWxeYT+Jkvj7Vlk5JycUitv3JUjomoDekPAkUoGh0m7MOHceNe5l+", "ehe3LQxKXFrt/NNsQSZhaLiz0oEhy5ctQpqWTqSg+00=", new Class[0]);
                        dhVarG.t("HiRHV0+7iHel8ouy3rC3Vh6JmfAaV6+B5y9bcOz6v6RtgCUkDJJ1u0Sc7x4KnqIM", "XIDT/tdnEZKwO9t3IF1TXzt4lSi3aThE4MpcZzXzgu8=", new Class[0]);
                        dhVarG.t("NVotBewebesTf3yaQqbfIHsAQGGO5mYV6zcO8zQG+1Te4y/3fFN6rm5Uo4mLM7YY", "Tgl2ye65VdPWpGRA4PcAavXIUkvdg+RB2j/Kpy7fLYc=", new Class[0]);
                        dhVarG.t("kqx1em1yk7MpX3m25KaHLmM/cmSaigSw7EiXU2reD6DVU/yG3Bj+ID2Om7QFkYwd", "7E6XPHHgJYFzxm7py5uavXz1wvEMAaDOWzYZ4RGmH8Q=", new Class[0]);
                        dhVarG.t("CNH0HFMOMU1Nrmid580u5GwyoVtbweFPAsHIvna6oGuy7GvzbjYQOB8wix+zhJ0t", "afOCxwiNZt1pFw/pjRCeFiRYbGwWcjibO33q64LhR0M=", new Class[0]);
                        dhVarG.t("mC2vnvn09mABIg+Z3lW4jT9JiWpty1Pg+VYrat/OBbcFnzi+qVKsaQnZ8pNi1wxq", "8G9c9fsfPvjJxInHRs9Zm9vZr56UYrRb8WMC1rhyiOA=", new Class[0]);
                        dhVarG.t("AEKrzIydHngo8q7U2b8x25JI4cfZS+4qAP315Zd3WikH6poIulxYQwD/LrG8ezMS", "vKrEk100dPKKqaxICALjJbVlJ7Gg4dfwKwDEqSKZDKo=", Context.class, cls, String.class);
                        dhVarG.t("FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=", StackTraceElement[].class);
                        dhVarG.t("W/9c3Hd1yf7t5yHhoE/TlmEcdgBJrlLUo34Voj/Idw5FIbJ80EX+SS3nO2jLEMGu", "gqK1fJWMt2lYn7O2X7ompi2Bw14HxMMjzTnJdiQom2Q=", View.class, DisplayMetrics.class, cls, cls);
                        dhVarG.t("Bh5pClYU50tw4hiHvABH1pMF0C7RYCQSvKvFr+ZMSOJwQxEU/7HcV4ByjdhbUI8z", "nFFCV0RNg4jne34kh3cuJ7Rctyd77rnT1UYT4k6WJUQ=", Context.class, cls);
                        dhVarG.t("KT2Tv8TPKs8B/+lHkvvu6s01+PimOKMOvsBTxmvtb79k6T7ZyFNxwI/cZRLVhJ7V", "0IMe0hZjzvPOj0FU8vVpI60XmFXXOxBk0ZbCWvkG8dU=", View.class, Activity.class, cls);
                        dhVarG.t("xg6GNdV7fYR9czDPsYCpiIl0/69vO40WnrUnsYSb5exMDfWVVhFT+7O8xMnCz7QV", "mckfj+6L7YQAG+Kc7UoytYIs9AbnOm5Xq8IrT+DQQ5M=", Long.TYPE);
                        dhVarG.t("tV0LU7DrA7iCf0C6Jd6FHxawHMuTsVT6LNt0TOb/cblXH7T5JtR+TGOIdFUS28/f", "1Bl17hQq0WWTvmWWEgdcU2HCh9GQdFF/nionC9ho0WU=", new Class[0]);
                        try {
                            if (((Boolean) k3.w.c().b(ir.U2)).booleanValue()) {
                                dhVarG.t("+Lr3mNK9DiW6aOFsrAhw/ufFUWF1jNkYNrUOryhl9dmdhxcK7UxVybCFjyLF5UVn", "z6qQV45Nmnz8yfEHycE7xvBh5frOehaJSTK9o+9gqcg=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        dhVarG.t("3U0cjCPkA8fmy+qqbK7WJ2AhtyNFccQtIqqvzcvTqob91cu5tr66zNiNrkLc8aJb", "15gLcM46Z4orUYIpbooVfBRJ135AlZRFOmzWaSvqSHg=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) k3.w.c().b(ir.W2)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    dhVarG.t("2wtcCTLoT7a0RzNv8L+mVKR+6NVfukO9BpKgsaOGTiHGeYqcI7vlZYOTUtiUYK5a", "PuuRKBgJ4ot1aOnWjIUdGlqyRoZ6ZOMOeX7ZmvGezGg=", NetworkCapabilities.class, cls2, cls2);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        try {
                            if (((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue()) {
                                dhVarG.t("sGX187VmldVivMx8d2G9ijy8IexWLJjVBriaGlzwhpHKAK1AG3if6ICXfcjwXboZ", "IowIKykYnY6WZolnjAhl1KeEVDwldWZiaxuj9ry3exU=", List.class);
                            }
                        } catch (IllegalStateException unused4) {
                        }
                        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            dhVarG.t("fyLPA28mp7uPyBOReRADDijv3FZ1tUGnt5ZGr7JsU06e7RVIoG/wHKNRMf3WJSQe", "soiTax1jBnD3649O45Tb84AswyowGJo3bnB66jWq5Kw=", cls3, cls3, cls3, cls3);
                        } else {
                            try {
                                if (((Boolean) k3.w.c().b(ir.f10025n2)).booleanValue()) {
                                    dhVarG.t("C2cxj1PqlGI/7sXzj/vQoDZCGl/mHCTxIbvQCRFAKNnzfg9WbUpjhk8QJWw60E8Q", "faUXYiGUMq7bQIeIkZZxqavg/5i6OivEyj0LKDXCfso=", long[].class, Context.class, View.class);
                                }
                            } catch (IllegalStateException unused5) {
                            }
                        }
                    }
                    yf.G = dhVarG;
                }
            }
        }
        return yf.G;
    }

    static gh q(dh dhVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws tg {
        Method methodJ = dhVar.j("Tw8s+i46jU7h4eAAIyqjRm6Qx2s08AiuQFiQiAnvTc/m6i7qS69Zqr0xce6FwG0s", "dBvoahw90QxEayGvM7wPL8uyGyjAlcLulgarkCbJ360=");
        if (methodJ == null || motionEvent == null) {
            throw new tg();
        }
        try {
            return new gh((String) methodJ.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new tg(e5);
        }
    }

    protected static synchronized void t(Context context, boolean z10) {
        if (N) {
            return;
        }
        O = System.currentTimeMillis() / 1000;
        yf.G = p(context, z10);
        if (((Boolean) k3.w.c().b(ir.W2)).booleanValue()) {
            P = fg.c(context);
        }
        ExecutorService executorServiceK = yf.G.k();
        if (((Boolean) k3.w.c().b(ir.X2)).booleanValue() && executorServiceK != null) {
            Q = nh.d(context, executorServiceK);
        }
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            R = new eh();
        }
        N = true;
    }

    protected static final void u(List list) throws InterruptedException {
        ExecutorService executorServiceK;
        if (yf.G == null || (executorServiceK = yf.G.k()) == null || list.isEmpty()) {
            return;
        }
        try {
            executorServiceK.invokeAll(list, ((Long) k3.w.c().b(ir.f9981j2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            String str = M;
            StringWriter stringWriter = new StringWriter();
            e5.printStackTrace(new PrintWriter(stringWriter));
            Log.d(str, String.format("class methods got exception: %s", stringWriter.toString()));
        }
    }

    private final synchronized void v(dh dhVar, xc xcVar) {
        MotionEvent motionEvent;
        try {
            gh ghVarQ = q(dhVar, this.f18007m, this.E);
            Long l10 = ghVarQ.f8723b;
            if (l10 != null) {
                xcVar.I(l10.longValue());
            }
            Long l11 = ghVarQ.f8724c;
            if (l11 != null) {
                xcVar.J(l11.longValue());
            }
            Long l12 = ghVarQ.f8725d;
            if (l12 != null) {
                xcVar.G(l12.longValue());
            }
            if (this.D) {
                Long l13 = ghVarQ.f8726e;
                if (l13 != null) {
                    xcVar.F(l13.longValue());
                }
                Long l14 = ghVarQ.f8727f;
                if (l14 != null) {
                    xcVar.C(l14.longValue());
                }
            }
        } catch (tg unused) {
        }
        rd rdVarK = sd.K();
        if (this.f18009o > 0 && hh.e(this.E)) {
            rdVarK.y(hh.a(this.f18016v, 1, this.E));
            rdVarK.L(hh.a(this.A - this.f18019y, 1, this.E));
            rdVarK.M(hh.a(this.B - this.f18020z, 1, this.E));
            rdVarK.E(hh.a(this.f18019y, 1, this.E));
            rdVarK.G(hh.a(this.f18020z, 1, this.E));
            if (this.D && (motionEvent = this.f18007m) != null) {
                long jA = hh.a(((this.f18019y - this.A) + motionEvent.getRawX()) - this.f18007m.getX(), 1, this.E);
                if (jA != 0) {
                    rdVarK.J(jA);
                }
                long jA2 = hh.a(((this.f18020z - this.B) + this.f18007m.getRawY()) - this.f18007m.getY(), 1, this.E);
                if (jA2 != 0) {
                    rdVarK.K(jA2);
                }
            }
        }
        try {
            gh ghVarM = m(this.f18007m);
            Long l15 = ghVarM.f8723b;
            if (l15 != null) {
                rdVarK.F(l15.longValue());
            }
            Long l16 = ghVarM.f8724c;
            if (l16 != null) {
                rdVarK.H(l16.longValue());
            }
            rdVarK.D(ghVarM.f8725d.longValue());
            if (this.D) {
                Long l17 = ghVarM.f8727f;
                if (l17 != null) {
                    rdVarK.B(l17.longValue());
                }
                Long l18 = ghVarM.f8726e;
                if (l18 != null) {
                    rdVarK.C(l18.longValue());
                }
                Long l19 = ghVarM.f8728g;
                if (l19 != null) {
                    rdVarK.O(l19.longValue() != 0 ? 2 : 1);
                }
                if (this.f18010p > 0) {
                    Long lValueOf = hh.e(this.E) ? Long.valueOf(Math.round(this.f18015u / this.f18010p)) : null;
                    if (lValueOf != null) {
                        rdVarK.v(lValueOf.longValue());
                    } else {
                        rdVarK.u();
                    }
                    rdVarK.w(Math.round(this.f18014t / this.f18010p));
                }
                Long l20 = ghVarM.f8731j;
                if (l20 != null) {
                    rdVarK.z(l20.longValue());
                }
                Long l21 = ghVarM.f8732k;
                if (l21 != null) {
                    rdVarK.I(l21.longValue());
                }
                Long l22 = ghVarM.f8733l;
                if (l22 != null) {
                    rdVarK.N(l22.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (tg unused2) {
        }
        long j10 = this.f18013s;
        if (j10 > 0) {
            rdVarK.A(j10);
        }
        xcVar.M((sd) rdVarK.m());
        long j11 = this.f18009o;
        if (j11 > 0) {
            xcVar.D(j11);
        }
        long j12 = this.f18010p;
        if (j12 > 0) {
            xcVar.E(j12);
        }
        long j13 = this.f18011q;
        if (j13 > 0) {
            xcVar.H(j13);
        }
        long j14 = this.f18012r;
        if (j14 > 0) {
            xcVar.B(j14);
        }
        try {
            int size = this.f18008n.size() - 1;
            if (size > 0) {
                xcVar.d0();
                for (int i10 = 0; i10 < size; i10++) {
                    gh ghVarQ2 = q(yf.G, (MotionEvent) this.f18008n.get(i10), this.E);
                    rd rdVarK2 = sd.K();
                    rdVarK2.F(ghVarQ2.f8723b.longValue());
                    rdVarK2.H(ghVarQ2.f8724c.longValue());
                    xcVar.V((sd) rdVarK2.m());
                }
            }
        } catch (tg unused3) {
            xcVar.d0();
        }
    }

    private static final void w() {
        nh nhVar = Q;
        if (nhVar != null) {
            nhVar.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void b(View view) {
        if (((Boolean) k3.w.c().b(ir.f10014m2)).booleanValue()) {
            if (this.J == null) {
                dh dhVar = yf.G;
                this.J = new lh(dhVar.f7297a, dhVar.f());
            }
            this.J.d(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.yf
    protected final long i(StackTraceElement[] stackTraceElementArr) throws tg {
        Method methodJ = yf.G.j("FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=");
        if (methodJ == null || stackTraceElementArr == null) {
            throw new tg();
        }
        try {
            return new ug((String) methodJ.invoke(null, stackTraceElementArr)).f16323b.longValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new tg(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.yf
    protected final xc j(Context context, View view, Activity activity) throws InterruptedException {
        w();
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            R.i();
        }
        xc xcVarK0 = vd.k0();
        if (!TextUtils.isEmpty(this.I)) {
            xcVarK0.j0(this.I);
        }
        s(p(context, this.H), xcVarK0, view, activity, true, context);
        return xcVarK0;
    }

    @Override // com.google.android.gms.internal.ads.yf
    protected final xc k(Context context, qc qcVar) throws InterruptedException {
        w();
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            R.j();
        }
        xc xcVarK0 = vd.k0();
        if (!TextUtils.isEmpty(this.I)) {
            xcVarK0.j0(this.I);
        }
        dh dhVarP = p(context, this.H);
        if (dhVarP.k() != null) {
            u(r(dhVarP, context, xcVarK0, null));
        }
        return xcVarK0;
    }

    @Override // com.google.android.gms.internal.ads.yf
    protected final xc l(Context context, View view, Activity activity) throws InterruptedException {
        w();
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            R.k(context, view);
        }
        xc xcVarK0 = vd.k0();
        xcVarK0.j0(this.I);
        s(p(context, this.H), xcVarK0, view, activity, false, context);
        return xcVarK0;
    }

    @Override // com.google.android.gms.internal.ads.yf
    protected final gh m(MotionEvent motionEvent) throws tg {
        Method methodJ = yf.G.j("5kaSofNlVXtCUNlGdVeQWvaOP7NTIA28WhQGVqYMr2+1W5DIZ4rAeif/Ixnxac6c", "6DjMpZpwaW5op66Lef2rZgfmub82/L76U+lowNvybUI=");
        if (methodJ == null || motionEvent == null) {
            throw new tg();
        }
        try {
            return new gh((String) methodJ.invoke(null, motionEvent, this.E));
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new tg(e5);
        }
    }

    protected List r(dh dhVar, Context context, xc xcVar, qc qcVar) {
        long jC;
        long jB;
        int iA = dhVar.a();
        ArrayList arrayList = new ArrayList();
        if (!dhVar.r()) {
            xcVar.y(16384L);
            return arrayList;
        }
        arrayList.add(new th(dhVar, "AEKrzIydHngo8q7U2b8x25JI4cfZS+4qAP315Zd3WikH6poIulxYQwD/LrG8ezMS", "vKrEk100dPKKqaxICALjJbVlJ7Gg4dfwKwDEqSKZDKo=", xcVar, iA, 27, context, null));
        arrayList.add(new wh(dhVar, "GZmNPeawNfdnWxeYT+Jkvj7Vlk5JycUitv3JUjomoDekPAkUoGh0m7MOHceNe5l+", "ehe3LQxKXFrt/NNsQSZhaLiz0oEhy5ctQpqWTqSg+00=", xcVar, O, iA, 25));
        arrayList.add(new gi(dhVar, "NVotBewebesTf3yaQqbfIHsAQGGO5mYV6zcO8zQG+1Te4y/3fFN6rm5Uo4mLM7YY", "Tgl2ye65VdPWpGRA4PcAavXIUkvdg+RB2j/Kpy7fLYc=", xcVar, iA, 1));
        arrayList.add(new ji(dhVar, "Jdw9xFuo4OHuL+Waf9VEkBs6M7XtRhuX3PknFoicWEjQXQ4CENXY5MXEEK1WPoR/", "NFKyR+VbXbtroBTvca7ACsz/BEp9N5Lv9/EMVuAgXOo=", xcVar, iA, 31, context));
        arrayList.add(new oi(dhVar, "HiRHV0+7iHel8ouy3rC3Vh6JmfAaV6+B5y9bcOz6v6RtgCUkDJJ1u0Sc7x4KnqIM", "XIDT/tdnEZKwO9t3IF1TXzt4lSi3aThE4MpcZzXzgu8=", xcVar, iA, 33));
        arrayList.add(new rh(dhVar, "gRiEqMdygJbXVwKGpJJS0XfYaGpCoNDcsHcIyHSZIcdpg+a2r1SI+bnO9R0NWRI0", "EBqSzSIe3Rjv1o1jIB+xCBngdhv60cOxeintd9wp68g=", xcVar, iA, 29, context));
        arrayList.add(new uh(dhVar, "9Ibp0iX8frxcDol5LCDOary7OEblvzOEr0WtPn69zRxHnh2qqHn8v0kanoAZtnND", "icVSPKCsokOqk/nN9ldgEGzs48x1unFAjrOT1dBDO7k=", xcVar, iA, 5));
        arrayList.add(new fi(dhVar, "I+xlh/5GUzBsQHWA4Anrxm/J1H2aa2zRtcwvegQCTHllS1Tl5YGYaDcQHq23j0mf", "i/S3Ms1xTrAJGHFn1omMI5XPFfDzyhz5oaagmOhDNQg=", xcVar, iA, 12));
        arrayList.add(new hi(dhVar, "/eWSSnmYTOwLgnyjztZ17bt5eITOkf8Wjh78RPrx7GUZwaLGo/MX2SyicRamXiG+", "tvpwr35XXUfFfc9l/XoM3WDKfcmrAeKjBJbIgi/9trQ=", xcVar, iA, 3));
        arrayList.add(new vh(dhVar, "kqx1em1yk7MpX3m25KaHLmM/cmSaigSw7EiXU2reD6DVU/yG3Bj+ID2Om7QFkYwd", "7E6XPHHgJYFzxm7py5uavXz1wvEMAaDOWzYZ4RGmH8Q=", xcVar, iA, 44));
        arrayList.add(new bi(dhVar, "CNH0HFMOMU1Nrmid580u5GwyoVtbweFPAsHIvna6oGuy7GvzbjYQOB8wix+zhJ0t", "afOCxwiNZt1pFw/pjRCeFiRYbGwWcjibO33q64LhR0M=", xcVar, iA, 22));
        arrayList.add(new pi(dhVar, "7sn4HHbUg+T4b9n1KPrutL8tcrilMYlvs7RJQ5pmfB/1m2qwJzRoxivnCVXu/U+z", "apLnpmRDpCfdu10ORTmQ+sdRCmiB4EA8hGSHUeA9nD0=", xcVar, iA, 48));
        arrayList.add(new qh(dhVar, "kwtXYBCvBLfWcikGQlC0YCCiAi3jf0v8mKFP3Rqx70Jf0cytKZO4qWHMAffIVrkU", "nMO31gtWkn27JzpwW/zLPiiIPhLCWt7BVghY/Hyr+TE=", xcVar, iA, 49));
        arrayList.add(new mi(dhVar, "mC2vnvn09mABIg+Z3lW4jT9JiWpty1Pg+VYrat/OBbcFnzi+qVKsaQnZ8pNi1wxq", "8G9c9fsfPvjJxInHRs9Zm9vZr56UYrRb8WMC1rhyiOA=", xcVar, iA, 51));
        arrayList.add(new ki(dhVar, "Bh5pClYU50tw4hiHvABH1pMF0C7RYCQSvKvFr+ZMSOJwQxEU/7HcV4ByjdhbUI8z", "nFFCV0RNg4jne34kh3cuJ7Rctyd77rnT1UYT4k6WJUQ=", xcVar, iA, 61));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) k3.w.c().b(ir.W2)).booleanValue()) {
                nh nhVar = Q;
                if (nhVar != null) {
                    jC = nhVar.c();
                    jB = nhVar.b();
                } else {
                    jC = -1;
                    jB = -1;
                }
                arrayList.add(new ei(dhVar, "2wtcCTLoT7a0RzNv8L+mVKR+6NVfukO9BpKgsaOGTiHGeYqcI7vlZYOTUtiUYK5a", "PuuRKBgJ4ot1aOnWjIUdGlqyRoZ6ZOMOeX7ZmvGezGg=", xcVar, iA, 11, P, jC, jB));
            }
        }
        if (((Boolean) k3.w.c().b(ir.U2)).booleanValue()) {
            arrayList.add(new ii(dhVar, "+Lr3mNK9DiW6aOFsrAhw/ufFUWF1jNkYNrUOryhl9dmdhxcK7UxVybCFjyLF5UVn", "z6qQV45Nmnz8yfEHycE7xvBh5frOehaJSTK9o+9gqcg=", xcVar, iA, 73));
        }
        arrayList.add(new ci(dhVar, "3U0cjCPkA8fmy+qqbK7WJ2AhtyNFccQtIqqvzcvTqob91cu5tr66zNiNrkLc8aJb", "15gLcM46Z4orUYIpbooVfBRJ135AlZRFOmzWaSvqSHg=", xcVar, iA, 76));
        if (((Boolean) k3.w.c().b(ir.Z2)).booleanValue()) {
            arrayList.add(new ph(dhVar, "tV0LU7DrA7iCf0C6Jd6FHxawHMuTsVT6LNt0TOb/cblXH7T5JtR+TGOIdFUS28/f", "1Bl17hQq0WWTvmWWEgdcU2HCh9GQdFF/nionC9ho0WU=", xcVar, iA, 89));
        }
        return arrayList;
    }

    protected final void s(dh dhVar, xc xcVar, View view, Activity activity, boolean z10, Context context) throws InterruptedException {
        List listAsList;
        ui diVar;
        if (dhVar.r()) {
            v(dhVar, xcVar);
            ArrayList arrayList = new ArrayList();
            if (dhVar.k() != null) {
                int iA = dhVar.a();
                arrayList.add(new yh(dhVar, xcVar));
                arrayList.add(new gi(dhVar, "NVotBewebesTf3yaQqbfIHsAQGGO5mYV6zcO8zQG+1Te4y/3fFN6rm5Uo4mLM7YY", "Tgl2ye65VdPWpGRA4PcAavXIUkvdg+RB2j/Kpy7fLYc=", xcVar, iA, 1));
                arrayList.add(new wh(dhVar, "GZmNPeawNfdnWxeYT+Jkvj7Vlk5JycUitv3JUjomoDekPAkUoGh0m7MOHceNe5l+", "ehe3LQxKXFrt/NNsQSZhaLiz0oEhy5ctQpqWTqSg+00=", xcVar, O, iA, 25));
                arrayList.add(new vh(dhVar, "kqx1em1yk7MpX3m25KaHLmM/cmSaigSw7EiXU2reD6DVU/yG3Bj+ID2Om7QFkYwd", "7E6XPHHgJYFzxm7py5uavXz1wvEMAaDOWzYZ4RGmH8Q=", xcVar, iA, 44));
                arrayList.add(new fi(dhVar, "I+xlh/5GUzBsQHWA4Anrxm/J1H2aa2zRtcwvegQCTHllS1Tl5YGYaDcQHq23j0mf", "i/S3Ms1xTrAJGHFn1omMI5XPFfDzyhz5oaagmOhDNQg=", xcVar, iA, 12));
                arrayList.add(new hi(dhVar, "/eWSSnmYTOwLgnyjztZ17bt5eITOkf8Wjh78RPrx7GUZwaLGo/MX2SyicRamXiG+", "tvpwr35XXUfFfc9l/XoM3WDKfcmrAeKjBJbIgi/9trQ=", xcVar, iA, 3));
                arrayList.add(new bi(dhVar, "CNH0HFMOMU1Nrmid580u5GwyoVtbweFPAsHIvna6oGuy7GvzbjYQOB8wix+zhJ0t", "afOCxwiNZt1pFw/pjRCeFiRYbGwWcjibO33q64LhR0M=", xcVar, iA, 22));
                arrayList.add(new uh(dhVar, "9Ibp0iX8frxcDol5LCDOary7OEblvzOEr0WtPn69zRxHnh2qqHn8v0kanoAZtnND", "icVSPKCsokOqk/nN9ldgEGzs48x1unFAjrOT1dBDO7k=", xcVar, iA, 5));
                arrayList.add(new pi(dhVar, "7sn4HHbUg+T4b9n1KPrutL8tcrilMYlvs7RJQ5pmfB/1m2qwJzRoxivnCVXu/U+z", "apLnpmRDpCfdu10ORTmQ+sdRCmiB4EA8hGSHUeA9nD0=", xcVar, iA, 48));
                arrayList.add(new qh(dhVar, "kwtXYBCvBLfWcikGQlC0YCCiAi3jf0v8mKFP3Rqx70Jf0cytKZO4qWHMAffIVrkU", "nMO31gtWkn27JzpwW/zLPiiIPhLCWt7BVghY/Hyr+TE=", xcVar, iA, 49));
                arrayList.add(new mi(dhVar, "mC2vnvn09mABIg+Z3lW4jT9JiWpty1Pg+VYrat/OBbcFnzi+qVKsaQnZ8pNi1wxq", "8G9c9fsfPvjJxInHRs9Zm9vZr56UYrRb8WMC1rhyiOA=", xcVar, iA, 51));
                arrayList.add(new li(dhVar, "FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=", xcVar, iA, 45, new Throwable().getStackTrace()));
                arrayList.add(new qi(dhVar, "W/9c3Hd1yf7t5yHhoE/TlmEcdgBJrlLUo34Voj/Idw5FIbJ80EX+SS3nO2jLEMGu", "gqK1fJWMt2lYn7O2X7ompi2Bw14HxMMjzTnJdiQom2Q=", xcVar, iA, 57, view));
                arrayList.add(new ki(dhVar, "Bh5pClYU50tw4hiHvABH1pMF0C7RYCQSvKvFr+ZMSOJwQxEU/7HcV4ByjdhbUI8z", "nFFCV0RNg4jne34kh3cuJ7Rctyd77rnT1UYT4k6WJUQ=", xcVar, iA, 61));
                if (((Boolean) k3.w.c().b(ir.f9992k2)).booleanValue()) {
                    arrayList.add(new oh(dhVar, "KT2Tv8TPKs8B/+lHkvvu6s01+PimOKMOvsBTxmvtb79k6T7ZyFNxwI/cZRLVhJ7V", "0IMe0hZjzvPOj0FU8vVpI60XmFXXOxBk0ZbCWvkG8dU=", xcVar, iA, 62, view, activity));
                }
                if (((Boolean) k3.w.c().b(ir.Z2)).booleanValue()) {
                    arrayList.add(new ph(dhVar, "tV0LU7DrA7iCf0C6Jd6FHxawHMuTsVT6LNt0TOb/cblXH7T5JtR+TGOIdFUS28/f", "1Bl17hQq0WWTvmWWEgdcU2HCh9GQdFF/nionC9ho0WU=", xcVar, iA, 89));
                }
                if (!z10) {
                    try {
                        if (((Boolean) k3.w.c().b(ir.f10025n2)).booleanValue()) {
                            arrayList.add(new ai(dhVar, "C2cxj1PqlGI/7sXzj/vQoDZCGl/mHCTxIbvQCRFAKNnzfg9WbUpjhk8QJWw60E8Q", "faUXYiGUMq7bQIeIkZZxqavg/5i6OivEyj0LKDXCfso=", xcVar, iA, 85, this.K, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
                            arrayList.add(new zh(dhVar, "fyLPA28mp7uPyBOReRADDijv3FZ1tUGnt5ZGr7JsU06e7RVIoG/wHKNRMf3WJSQe", "soiTax1jBnD3649O45Tb84AswyowGJo3bnB66jWq5Kw=", xcVar, iA, 85, R));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue()) {
                        diVar = new di(dhVar, "sGX187VmldVivMx8d2G9ijy8IexWLJjVBriaGlzwhpHKAK1AG3if6ICXfcjwXboZ", "IowIKykYnY6WZolnjAhl1KeEVDwldWZiaxuj9ry3exU=", xcVar, iA, 94, this.F);
                        arrayList.add(diVar);
                    }
                } else if (((Boolean) k3.w.c().b(ir.f10014m2)).booleanValue()) {
                    diVar = new ni(dhVar, "xg6GNdV7fYR9czDPsYCpiIl0/69vO40WnrUnsYSb5exMDfWVVhFT+7O8xMnCz7QV", "mckfj+6L7YQAG+Kc7UoytYIs9AbnOm5Xq8IrT+DQQ5M=", xcVar, iA, 53, this.J);
                    arrayList.add(diVar);
                }
            }
            listAsList = arrayList;
        } else {
            xcVar.y(16384L);
            listAsList = Arrays.asList(new yh(dhVar, xcVar));
        }
        u(listAsList);
    }
}
