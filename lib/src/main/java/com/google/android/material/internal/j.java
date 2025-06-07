package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private float f21085c;

    /* renamed from: f, reason: collision with root package name */
    private p5.d f21088f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f21083a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final p5.f f21084b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f21086d = true;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f21087e = new WeakReference(null);

    class a extends p5.f {
        a() {
        }

        @Override // p5.f
        public void a(int i10) {
            j.this.f21086d = true;
            b bVar = (b) j.this.f21087e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // p5.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            j.this.f21086d = true;
            b bVar = (b) j.this.f21087e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f21083a.measureText(charSequence, 0, charSequence.length());
    }

    public p5.d d() {
        return this.f21088f;
    }

    public TextPaint e() {
        return this.f21083a;
    }

    public float f(String str) {
        if (!this.f21086d) {
            return this.f21085c;
        }
        float fC = c(str);
        this.f21085c = fC;
        this.f21086d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f21087e = new WeakReference(bVar);
    }

    public void h(p5.d dVar, Context context) {
        if (this.f21088f != dVar) {
            this.f21088f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f21083a, this.f21084b);
                b bVar = (b) this.f21087e.get();
                if (bVar != null) {
                    this.f21083a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f21083a, this.f21084b);
                this.f21086d = true;
            }
            b bVar2 = (b) this.f21087e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f21086d = z10;
    }

    public void j(Context context) {
        this.f21088f.n(context, this.f21083a, this.f21084b);
    }
}
