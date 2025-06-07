package r5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f26574i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f26575j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f26576k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f26577l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f26578a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f26579b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f26580c;

    /* renamed from: d, reason: collision with root package name */
    private int f26581d;

    /* renamed from: e, reason: collision with root package name */
    private int f26582e;

    /* renamed from: f, reason: collision with root package name */
    private int f26583f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f26584g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f26585h;

    public a() {
        this(-16777216);
    }

    public a(int i10) {
        this.f26584g = new Path();
        this.f26585h = new Paint();
        this.f26578a = new Paint();
        d(i10);
        this.f26585h.setColor(0);
        Paint paint = new Paint(4);
        this.f26579b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26580c = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f5, float f10) {
        boolean z10 = f10 < 0.0f;
        Path path = this.f26584g;
        if (z10) {
            int[] iArr = f26576k;
            iArr[0] = 0;
            iArr[1] = this.f26583f;
            iArr[2] = this.f26582e;
            iArr[3] = this.f26581d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f10);
            path.close();
            float f11 = -i10;
            rectF.inset(f11, f11);
            int[] iArr2 = f26576k;
            iArr2[0] = 0;
            iArr2[1] = this.f26581d;
            iArr2[2] = this.f26582e;
            iArr2[3] = this.f26583f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i10 / fWidth);
        float[] fArr = f26577l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        this.f26579b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f26576k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f26585h);
        }
        canvas.drawArc(rectF, f5, f10, true, this.f26579b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f26574i;
        iArr[0] = this.f26583f;
        iArr[1] = this.f26582e;
        iArr[2] = this.f26581d;
        Paint paint = this.f26580c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, f26575j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f26580c);
        canvas.restore();
    }

    public Paint c() {
        return this.f26578a;
    }

    public void d(int i10) {
        this.f26581d = androidx.core.graphics.a.j(i10, 68);
        this.f26582e = androidx.core.graphics.a.j(i10, 20);
        this.f26583f = androidx.core.graphics.a.j(i10, 0);
        this.f26578a.setColor(this.f26581d);
    }
}
