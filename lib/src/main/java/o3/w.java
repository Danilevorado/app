package o3;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private String f25716a;

    /* renamed from: b, reason: collision with root package name */
    private List f25717b;

    /* renamed from: c, reason: collision with root package name */
    private String f25718c;

    /* renamed from: d, reason: collision with root package name */
    private g3.d f25719d;

    /* renamed from: e, reason: collision with root package name */
    private String f25720e;

    /* renamed from: f, reason: collision with root package name */
    private String f25721f;

    /* renamed from: g, reason: collision with root package name */
    private Double f25722g;

    /* renamed from: h, reason: collision with root package name */
    private String f25723h;

    /* renamed from: i, reason: collision with root package name */
    private String f25724i;

    /* renamed from: j, reason: collision with root package name */
    private d3.w f25725j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25726k;

    /* renamed from: l, reason: collision with root package name */
    private View f25727l;

    /* renamed from: m, reason: collision with root package name */
    private View f25728m;

    /* renamed from: n, reason: collision with root package name */
    private Object f25729n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f25730o = new Bundle();

    /* renamed from: p, reason: collision with root package name */
    private boolean f25731p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25732q;

    /* renamed from: r, reason: collision with root package name */
    private float f25733r;

    public final void A(boolean z10) {
        this.f25731p = z10;
    }

    public final void B(String str) {
        this.f25724i = str;
    }

    public final void C(Double d10) {
        this.f25722g = d10;
    }

    public final void D(String str) {
        this.f25723h = str;
    }

    public abstract void E(View view, Map map, Map map2);

    public void F(View view) {
    }

    public final View G() {
        return this.f25728m;
    }

    public final d3.w H() {
        return this.f25725j;
    }

    public final Object I() {
        return this.f25729n;
    }

    public final void J(Object obj) {
        this.f25729n = obj;
    }

    public final void K(d3.w wVar) {
        this.f25725j = wVar;
    }

    public View a() {
        return this.f25727l;
    }

    public final String b() {
        return this.f25721f;
    }

    public final String c() {
        return this.f25718c;
    }

    public final String d() {
        return this.f25720e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    public final Bundle g() {
        return this.f25730o;
    }

    public final String h() {
        return this.f25716a;
    }

    public final g3.d i() {
        return this.f25719d;
    }

    public final List j() {
        return this.f25717b;
    }

    public float k() {
        return this.f25733r;
    }

    public final boolean l() {
        return this.f25732q;
    }

    public final boolean m() {
        return this.f25731p;
    }

    public final String n() {
        return this.f25724i;
    }

    public final Double o() {
        return this.f25722g;
    }

    public final String p() {
        return this.f25723h;
    }

    public void q(View view) {
    }

    public boolean r() {
        return this.f25726k;
    }

    public void s() {
    }

    public final void t(String str) {
        this.f25721f = str;
    }

    public final void u(String str) {
        this.f25718c = str;
    }

    public final void v(String str) {
        this.f25720e = str;
    }

    public final void w(String str) {
        this.f25716a = str;
    }

    public final void x(g3.d dVar) {
        this.f25719d = dVar;
    }

    public final void y(List list) {
        this.f25717b = list;
    }

    public final void z(boolean z10) {
        this.f25732q = z10;
    }
}
