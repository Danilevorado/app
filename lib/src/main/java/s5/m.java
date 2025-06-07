package s5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public float f27003a;

    /* renamed from: b, reason: collision with root package name */
    public float f27004b;

    /* renamed from: c, reason: collision with root package name */
    public float f27005c;

    /* renamed from: d, reason: collision with root package name */
    public float f27006d;

    /* renamed from: e, reason: collision with root package name */
    public float f27007e;

    /* renamed from: f, reason: collision with root package name */
    public float f27008f;

    /* renamed from: g, reason: collision with root package name */
    private final List f27009g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f27010h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f27011i;

    class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f27012b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f27013c;

        a(List list, Matrix matrix) {
            this.f27012b = list;
            this.f27013c = matrix;
        }

        @Override // s5.m.g
        public void a(Matrix matrix, r5.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f27012b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f27013c, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final d f27015b;

        public b(d dVar) {
            this.f27015b = dVar;
        }

        @Override // s5.m.g
        public void a(Matrix matrix, r5.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f27015b.k(), this.f27015b.o(), this.f27015b.l(), this.f27015b.j()), i10, this.f27015b.m(), this.f27015b.n());
        }
    }

    static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        private final e f27016b;

        /* renamed from: c, reason: collision with root package name */
        private final float f27017c;

        /* renamed from: d, reason: collision with root package name */
        private final float f27018d;

        public c(e eVar, float f5, float f10) {
            this.f27016b = eVar;
            this.f27017c = f5;
            this.f27018d = f10;
        }

        @Override // s5.m.g
        public void a(Matrix matrix, r5.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f27016b.f27027c - this.f27018d, this.f27016b.f27026b - this.f27017c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f27017c, this.f27018d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f27016b.f27027c - this.f27018d) / (this.f27016b.f27026b - this.f27017c)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f27019h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f27020b;

        /* renamed from: c, reason: collision with root package name */
        public float f27021c;

        /* renamed from: d, reason: collision with root package name */
        public float f27022d;

        /* renamed from: e, reason: collision with root package name */
        public float f27023e;

        /* renamed from: f, reason: collision with root package name */
        public float f27024f;

        /* renamed from: g, reason: collision with root package name */
        public float f27025g;

        public d(float f5, float f10, float f11, float f12) {
            q(f5);
            u(f10);
            r(f11);
            p(f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f27023e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f27020b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f27022d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f27024f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f27025g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f27021c;
        }

        private void p(float f5) {
            this.f27023e = f5;
        }

        private void q(float f5) {
            this.f27020b = f5;
        }

        private void r(float f5) {
            this.f27022d = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f5) {
            this.f27024f = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f5) {
            this.f27025g = f5;
        }

        private void u(float f5) {
            this.f27021c = f5;
        }

        @Override // s5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f27028a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f27019h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f27026b;

        /* renamed from: c, reason: collision with root package name */
        private float f27027c;

        @Override // s5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f27028a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f27026b, this.f27027c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f27028a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f27029a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, r5.a aVar, int i10, Canvas canvas);

        public final void b(r5.a aVar, int i10, Canvas canvas) {
            a(f27029a, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f5) {
        if (g() == f5) {
            return;
        }
        float fG = ((f5 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f27010h.add(new b(dVar));
        p(f5);
    }

    private void c(g gVar, float f5, float f10) {
        b(f5);
        this.f27010h.add(gVar);
        p(f10);
    }

    private float g() {
        return this.f27007e;
    }

    private float h() {
        return this.f27008f;
    }

    private void p(float f5) {
        this.f27007e = f5;
    }

    private void q(float f5) {
        this.f27008f = f5;
    }

    private void r(float f5) {
        this.f27005c = f5;
    }

    private void s(float f5) {
        this.f27006d = f5;
    }

    private void t(float f5) {
        this.f27003a = f5;
    }

    private void u(float f5) {
        this.f27004b = f5;
    }

    public void a(float f5, float f10, float f11, float f12, float f13, float f14) {
        d dVar = new d(f5, f10, f11, f12);
        dVar.s(f13);
        dVar.t(f14);
        this.f27009g.add(dVar);
        b bVar = new b(dVar);
        float f15 = f13 + f14;
        boolean z10 = f14 < 0.0f;
        if (z10) {
            f13 = (f13 + 180.0f) % 360.0f;
        }
        c(bVar, f13, z10 ? (180.0f + f15) % 360.0f : f15);
        double d10 = f15;
        r(((f5 + f11) * 0.5f) + (((f11 - f5) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f27009g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f27009g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f27011i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f27010h), new Matrix(matrix));
    }

    float i() {
        return this.f27005c;
    }

    float j() {
        return this.f27006d;
    }

    float k() {
        return this.f27003a;
    }

    float l() {
        return this.f27004b;
    }

    public void m(float f5, float f10) {
        e eVar = new e();
        eVar.f27026b = f5;
        eVar.f27027c = f10;
        this.f27009g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f5);
        s(f10);
    }

    public void n(float f5, float f10) {
        o(f5, f10, 270.0f, 0.0f);
    }

    public void o(float f5, float f10, float f11, float f12) {
        t(f5);
        u(f10);
        r(f5);
        s(f10);
        p(f11);
        q((f11 + f12) % 360.0f);
        this.f27009g.clear();
        this.f27010h.clear();
        this.f27011i = false;
    }
}
