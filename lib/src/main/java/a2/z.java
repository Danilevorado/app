package a2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint f98a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    private static final Paint f99b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f100c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f101d;

    /* renamed from: e, reason: collision with root package name */
    private static final Lock f102e;

    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f101d = hashSet;
        f102e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f100c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f102e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f98a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f102e.unlock();
            throw th;
        }
    }

    public static Bitmap b(u1.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapC = dVar.c(i10, i11, h(bitmap));
        l(bitmap, bitmapC);
        a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    public static Bitmap c(u1.d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return e(dVar, bitmap, i10, i11);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap e(u1.d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapC = dVar.c((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), h(bitmap));
        l(bitmap, bitmapC);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapC.getWidth() + "x" + bitmapC.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(fMin);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    public static Lock f() {
        return f102e;
    }

    public static int g(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void i(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    public static boolean j(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap k(u1.d dVar, Bitmap bitmap, int i10) {
        if (!j(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        i(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapC = dVar.c(Math.round(rectF.width()), Math.round(rectF.height()), h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapC.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    public static void l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
