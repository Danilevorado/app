package s5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f26985a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f26986b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f26987c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f26988d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f26989e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f26990f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f26991g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f26992h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f26993i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f26994j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f26995k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f26996l = true;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f26997a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f26998a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f26999b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f27000c;

        /* renamed from: d, reason: collision with root package name */
        public final b f27001d;

        /* renamed from: e, reason: collision with root package name */
        public final float f27002e;

        c(k kVar, float f5, RectF rectF, b bVar, Path path) {
            this.f27001d = bVar;
            this.f26998a = kVar;
            this.f27002e = f5;
            this.f27000c = rectF;
            this.f26999b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f26985a[i10] = new m();
            this.f26986b[i10] = new Matrix();
            this.f26987c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (i10 + 1) * 90;
    }

    private void b(c cVar, int i10) {
        this.f26992h[0] = this.f26985a[i10].k();
        this.f26992h[1] = this.f26985a[i10].l();
        this.f26986b[i10].mapPoints(this.f26992h);
        Path path = cVar.f26999b;
        float[] fArr = this.f26992h;
        if (i10 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f26985a[i10].d(this.f26986b[i10], cVar.f26999b);
        b bVar = cVar.f27001d;
        if (bVar != null) {
            bVar.a(this.f26985a[i10], this.f26986b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        m mVar;
        Matrix matrix;
        Path path;
        int i11 = (i10 + 1) % 4;
        this.f26992h[0] = this.f26985a[i10].i();
        this.f26992h[1] = this.f26985a[i10].j();
        this.f26986b[i10].mapPoints(this.f26992h);
        this.f26993i[0] = this.f26985a[i11].k();
        this.f26993i[1] = this.f26985a[i11].l();
        this.f26986b[i11].mapPoints(this.f26993i);
        float f5 = this.f26992h[0];
        float[] fArr = this.f26993i;
        float fMax = Math.max(((float) Math.hypot(f5 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f27000c, i10);
        this.f26991g.n(0.0f, 0.0f);
        f fVarJ = j(i10, cVar.f26998a);
        fVarJ.b(fMax, fI, cVar.f27002e, this.f26991g);
        this.f26994j.reset();
        this.f26991g.d(this.f26987c[i10], this.f26994j);
        if (this.f26996l && (fVarJ.a() || l(this.f26994j, i10) || l(this.f26994j, i11))) {
            Path path2 = this.f26994j;
            path2.op(path2, this.f26990f, Path.Op.DIFFERENCE);
            this.f26992h[0] = this.f26991g.k();
            this.f26992h[1] = this.f26991g.l();
            this.f26987c[i10].mapPoints(this.f26992h);
            Path path3 = this.f26989e;
            float[] fArr2 = this.f26992h;
            path3.moveTo(fArr2[0], fArr2[1]);
            mVar = this.f26991g;
            matrix = this.f26987c[i10];
            path = this.f26989e;
        } else {
            mVar = this.f26991g;
            matrix = this.f26987c[i10];
            path = cVar.f26999b;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f27001d;
        if (bVar != null) {
            bVar.b(this.f26991g, this.f26987c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        float f5;
        float f10;
        if (i10 == 1) {
            f5 = rectF.right;
        } else {
            if (i10 != 2) {
                f5 = i10 != 3 ? rectF.right : rectF.left;
                f10 = rectF.top;
                pointF.set(f5, f10);
            }
            f5 = rectF.left;
        }
        f10 = rectF.bottom;
        pointF.set(f5, f10);
    }

    private s5.c g(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float fCenterX;
        float f5;
        float[] fArr = this.f26992h;
        m[] mVarArr = this.f26985a;
        fArr[0] = mVarArr[i10].f27005c;
        fArr[1] = mVarArr[i10].f27006d;
        this.f26986b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            fCenterX = rectF.centerX();
            f5 = this.f26992h[0];
        } else {
            fCenterX = rectF.centerY();
            f5 = this.f26992h[1];
        }
        return Math.abs(fCenterX - f5);
    }

    private f j(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f26997a;
    }

    private boolean l(Path path, int i10) {
        this.f26995k.reset();
        this.f26985a[i10].d(this.f26986b[i10], this.f26995k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f26995k.computeBounds(rectF, true);
        path.op(this.f26995k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f26998a).b(this.f26985a[i10], 90.0f, cVar.f27002e, cVar.f27000c, g(i10, cVar.f26998a));
        float fA = a(i10);
        this.f26986b[i10].reset();
        f(i10, cVar.f27000c, this.f26988d);
        Matrix matrix = this.f26986b[i10];
        PointF pointF = this.f26988d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f26986b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f26992h[0] = this.f26985a[i10].i();
        this.f26992h[1] = this.f26985a[i10].j();
        this.f26986b[i10].mapPoints(this.f26992h);
        float fA = a(i10);
        this.f26987c[i10].reset();
        Matrix matrix = this.f26987c[i10];
        float[] fArr = this.f26992h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f26987c[i10].preRotate(fA);
    }

    public void d(k kVar, float f5, RectF rectF, Path path) {
        e(kVar, f5, rectF, null, path);
    }

    public void e(k kVar, float f5, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f26989e.rewind();
        this.f26990f.rewind();
        this.f26990f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f5, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f26989e.close();
        if (this.f26989e.isEmpty()) {
            return;
        }
        path.op(this.f26989e, Path.Op.UNION);
    }
}
