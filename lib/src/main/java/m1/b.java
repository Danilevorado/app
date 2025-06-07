package m1;

import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f25165d = "m1.b";

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f25166e = Pattern.compile(",");

    /* renamed from: a, reason: collision with root package name */
    private Camera.Size f25167a;

    /* renamed from: b, reason: collision with root package name */
    private Camera.Size f25168b;

    /* renamed from: c, reason: collision with root package name */
    private Context f25169c;

    private static class a implements Comparator {

        /* renamed from: m, reason: collision with root package name */
        private final int f25170m;

        /* renamed from: n, reason: collision with root package name */
        private final int f25171n;

        /* renamed from: o, reason: collision with root package name */
        private final float f25172o;

        a(int i10, int i11) {
            if (i10 < i11) {
                this.f25170m = i11;
                this.f25171n = i10;
            } else {
                this.f25170m = i10;
                this.f25171n = i11;
            }
            this.f25172o = this.f25171n / this.f25170m;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i10 = size.width;
            int i11 = size.height;
            int i12 = size2.width;
            int i13 = size2.height;
            int iCompare = Float.compare(Math.abs((i11 / i10) - this.f25172o), Math.abs((i13 / i12) - this.f25172o));
            return iCompare != 0 ? iCompare : (Math.abs(this.f25170m - i10) + Math.abs(this.f25171n - i11)) - (Math.abs(this.f25170m - i12) + Math.abs(this.f25171n - i13));
        }
    }

    b(Context context) {
        this.f25169c = context;
    }

    private static int a(CharSequence charSequence, int i10) throws NumberFormatException {
        int i11 = 0;
        for (String str : f25166e.split(charSequence)) {
            try {
                double d10 = Double.parseDouble(str.trim());
                int i12 = (int) (10.0d * d10);
                if (Math.abs(i10 - d10) < Math.abs(i10 - i11)) {
                    i11 = i12;
                }
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(android.hardware.Camera.Parameters r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            java.lang.String r0 = "zoom-supported"
            java.lang.String r0 = r9.get(r0)
            if (r0 == 0) goto Lf
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r0 = "max-zoom"
            java.lang.String r0 = r9.get(r0)
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            r3 = 10
            if (r0 == 0) goto L3a
            double r4 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L24
            double r4 = r4 * r1
            int r0 = (int) r4
            if (r3 <= r0) goto L3a
            goto L3b
        L24:
            java.lang.String r4 = m1.b.f25165d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bad max-zoom: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r4, r0)
        L3a:
            r0 = r3
        L3b:
            java.lang.String r4 = "taking-picture-zoom-max"
            java.lang.String r4 = r9.get(r4)
            if (r4 == 0) goto L61
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L4b
            if (r0 <= r4) goto L61
            r0 = r4
            goto L61
        L4b:
            java.lang.String r5 = m1.b.f25165d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Bad taking-picture-zoom-max: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.e(r5, r4)
        L61:
            java.lang.String r4 = "mot-zoom-values"
            java.lang.String r4 = r9.get(r4)
            if (r4 == 0) goto L6d
            int r0 = a(r4, r0)
        L6d:
            java.lang.String r4 = "mot-zoom-step"
            java.lang.String r4 = r9.get(r4)
            if (r4 == 0) goto L83
            java.lang.String r4 = r4.trim()     // Catch: java.lang.NumberFormatException -> L83
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.NumberFormatException -> L83
            double r4 = r4 * r1
            int r1 = (int) r4     // Catch: java.lang.NumberFormatException -> L83
            r2 = 1
            if (r1 <= r2) goto L83
            int r0 = r0 % r1
        L83:
            boolean r0 = r9.isZoomSupported()
            if (r0 == 0) goto Lac
            java.lang.String r0 = m1.b.f25165d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "max-zoom:"
            r1.append(r2)
            int r2 = r9.getMaxZoom()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            int r0 = r9.getMaxZoom()
            int r0 = r0 / r3
            r9.setZoom(r0)
            goto Lb3
        Lac:
            java.lang.String r9 = m1.b.f25165d
            java.lang.String r0 = "Unsupported zoom."
            android.util.Log.e(r9, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.b.f(android.hardware.Camera$Parameters):void");
    }

    protected Camera.Size b(int i10, int i11, List list) {
        Collections.sort(list, new a(i10, i11));
        return (Camera.Size) list.get(0);
    }

    Camera.Size c() {
        return this.f25167a;
    }

    void d(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f25167a = b(o1.b.b(this.f25169c), o1.b.a(this.f25169c), parameters.getSupportedPreviewSizes());
        String str = f25165d;
        Log.e(str, "Setting preview size: " + this.f25167a.width + "-" + this.f25167a.height);
        this.f25168b = b(o1.b.b(this.f25169c), o1.b.a(this.f25169c), parameters.getSupportedPictureSizes());
        Log.e(str, "Setting picture size: " + this.f25168b.width + "-" + this.f25168b.height);
    }

    void e(Camera camera) throws NumberFormatException {
        Camera.Parameters parameters = camera.getParameters();
        Camera.Size size = this.f25167a;
        parameters.setPreviewSize(size.width, size.height);
        Camera.Size size2 = this.f25168b;
        parameters.setPictureSize(size2.width, size2.height);
        f(parameters);
        camera.setDisplayOrientation(90);
        camera.setParameters(parameters);
    }
}
