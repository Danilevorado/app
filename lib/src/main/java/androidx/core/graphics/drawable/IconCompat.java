package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f2215k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f2216a;

    /* renamed from: b, reason: collision with root package name */
    Object f2217b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2218c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2219d;

    /* renamed from: e, reason: collision with root package name */
    public int f2220e;

    /* renamed from: f, reason: collision with root package name */
    public int f2221f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2222g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f2223h;

    /* renamed from: i, reason: collision with root package name */
    public String f2224i;

    /* renamed from: j, reason: collision with root package name */
    public String f2225j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            }
        }

        static int c(Object obj) {
            StringBuilder sb2;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                e = e5;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (NoSuchMethodException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (InvocationTargetException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f2216a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lb5;
                    case 0: goto L8;
                    case 1: goto L9c;
                    case 2: goto L91;
                    case 3: goto L84;
                    case 4: goto L7b;
                    case 5: goto L65;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.h()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto La4
            L20:
                if (r5 == 0) goto L4a
                java.io.InputStream r5 = r4.i(r5)
                if (r5 == 0) goto L2f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L76
                goto L6d
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.h()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L4a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.h()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L65:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L72
                java.lang.Object r5 = r4.f2217b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L6d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto La4
            L72:
                java.lang.Object r5 = r4.f2217b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L76:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.a(r5, r1)
                goto La0
            L7b:
                java.lang.Object r5 = r4.f2217b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto La4
            L84:
                java.lang.Object r5 = r4.f2217b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f2220e
                int r1 = r4.f2221f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto La4
            L91:
                java.lang.String r5 = r4.f()
                int r0 = r4.f2220e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto La4
            L9c:
                java.lang.Object r5 = r4.f2217b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            La0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            La4:
                android.content.res.ColorStateList r0 = r4.f2222g
                if (r0 == 0) goto Lab
                r5.setTintList(r0)
            Lab:
                android.graphics.PorterDuff$Mode r4 = r4.f2223h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f2215k
                if (r4 == r0) goto Lb4
                r5.setTintMode(r4)
            Lb4:
                return r5
            Lb5:
                java.lang.Object r4 = r4.f2217b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f2216a = -1;
        this.f2218c = null;
        this.f2219d = null;
        this.f2220e = 0;
        this.f2221f = 0;
        this.f2222g = null;
        this.f2223h = f2215k;
        this.f2224i = null;
    }

    IconCompat(int i10) {
        this.f2218c = null;
        this.f2219d = null;
        this.f2220e = 0;
        this.f2221f = 0;
        this.f2222g = null;
        this.f2223h = f2215k;
        this.f2224i = null;
        this.f2216a = i10;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f5 = iMin;
        float f10 = 0.5f * f5;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f5;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f5 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2217b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        androidx.core.util.c.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2220e = i10;
        if (resources != null) {
            try {
                iconCompat.f2217b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2217b = str;
        }
        iconCompat.f2225j = str;
        return iconCompat;
    }

    private static String n(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i10 = this.f2216a;
        if (i10 == -1) {
            Object obj = this.f2217b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f2217b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f2217b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i10 = this.f2216a;
        if (i10 == -1) {
            return a.a(this.f2217b);
        }
        if (i10 == 2) {
            return this.f2220e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i10 = this.f2216a;
        if (i10 == -1) {
            return a.b(this.f2217b);
        }
        if (i10 == 2) {
            String str = this.f2225j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2217b).split(":", -1)[0] : this.f2225j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i10 = this.f2216a;
        return i10 == -1 ? a.c(this.f2217b) : i10;
    }

    public Uri h() {
        int i10 = this.f2216a;
        if (i10 == -1) {
            return a.d(this.f2217b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2217b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        StringBuilder sb2;
        String str;
        Uri uriH = h();
        String scheme = uriH.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriH);
            } catch (Exception e5) {
                e = e5;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2217b));
            } catch (FileNotFoundException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb2.append(str);
        sb2.append(uriH);
        Log.w("IconCompat", sb2.toString(), e);
        return null;
    }

    public void j() {
        Parcelable parcelable;
        this.f2223h = PorterDuff.Mode.valueOf(this.f2224i);
        switch (this.f2216a) {
            case -1:
                parcelable = this.f2219d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f2219d;
                if (parcelable == null) {
                    byte[] bArr = this.f2218c;
                    this.f2217b = bArr;
                    this.f2216a = 3;
                    this.f2220e = 0;
                    this.f2221f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2218c, Charset.forName("UTF-16"));
                this.f2217b = str;
                if (this.f2216a == 2 && this.f2225j == null) {
                    this.f2225j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2217b = this.f2218c;
                return;
        }
        this.f2217b = parcelable;
    }

    public void k(boolean z10) {
        this.f2224i = this.f2223h.name();
        switch (this.f2216a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f2217b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2218c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2218c = ((String) this.f2217b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2218c = (byte[]) this.f2217b;
                return;
            case 4:
            case 6:
                this.f2218c = this.f2217b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f2219d = (Parcelable) this.f2217b;
    }

    public Icon l() {
        return m(null);
    }

    public Icon m(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        int height;
        if (this.f2216a == -1) {
            return String.valueOf(this.f2217b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(n(this.f2216a));
        switch (this.f2216a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2217b).getWidth());
                sb2.append("x");
                height = ((Bitmap) this.f2217b).getHeight();
                sb2.append(height);
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2225j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2220e);
                if (this.f2221f != 0) {
                    sb2.append(" off=");
                    height = this.f2221f;
                    sb2.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2217b);
                break;
        }
        if (this.f2222g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2222g);
        }
        if (this.f2223h != f2215k) {
            sb2.append(" mode=");
            sb2.append(this.f2223h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
