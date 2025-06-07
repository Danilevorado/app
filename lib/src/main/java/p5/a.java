package p5;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f25925a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0173a f25926b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25927c;

    /* renamed from: p5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0173a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0173a interfaceC0173a, Typeface typeface) {
        this.f25925a = typeface;
        this.f25926b = interfaceC0173a;
    }

    private void d(Typeface typeface) {
        if (this.f25927c) {
            return;
        }
        this.f25926b.a(typeface);
    }

    @Override // p5.f
    public void a(int i10) {
        d(this.f25925a);
    }

    @Override // p5.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f25927c = true;
    }
}
