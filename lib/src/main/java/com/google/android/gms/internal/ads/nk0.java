package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public interface nk0 extends k3.a, f91, ek0, p00, ll0, pl0, d10, nj, ul0, j3.l, xl0, yl0, lh0, zl0 {
    boolean B();

    void D0();

    Context E();

    l4.a E0();

    void F(String str, yi0 yi0Var);

    void F0(Context context);

    cm0 G();

    void G0(int i10);

    void H(kl0 kl0Var);

    void H0(boolean z10);

    em0 I();

    boolean I0();

    void J0();

    boolean K0();

    bg L();

    String M0();

    void N0(boolean z10);

    void O0(String str, gy gyVar);

    WebView P();

    void P0(String str, gy gyVar);

    void Q0(boolean z10);

    void R0(String str, i4.n nVar);

    ln2 S();

    void S0(du duVar);

    WebViewClient T();

    boolean T0();

    void U0(bu buVar);

    l3.r V();

    void V0(l3.r rVar);

    void W0();

    boolean X0(boolean z10, int i10);

    void Y0(String str, String str2, String str3);

    void Z0(l3.r rVar);

    void a1();

    void b1(boolean z10);

    void c1(em0 em0Var);

    boolean canGoBack();

    boolean d1();

    void destroy();

    void e1();

    void f1();

    l3.r g0();

    void g1(hn2 hn2Var, ln2 ln2Var);

    @Override // com.google.android.gms.internal.ads.pl0, com.google.android.gms.internal.ads.lh0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h1(boolean z10);

    Activity i();

    void i1(l4.a aVar);

    j3.a j();

    void j1(cl clVar);

    void k1();

    ab3 l1();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    ff0 m();

    void m1(int i10);

    void measure(int i10, int i11);

    yr n();

    void n1(boolean z10);

    void onPause();

    void onResume();

    kl0 q();

    du s();

    @Override // com.google.android.gms.internal.ads.lh0
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0();

    hn2 w();

    boolean x();

    cl y();

    View z();
}
