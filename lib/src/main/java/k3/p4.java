package k3;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final d3.g[] f24712a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24713b;

    public p4(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, d3.s.f22865a);
        String string = typedArrayObtainAttributes.getString(d3.s.f22866b);
        String string2 = typedArrayObtainAttributes.getString(d3.s.f22867c);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean z11 = !TextUtils.isEmpty(string2);
        if (z10 && !z11) {
            this.f24712a = c(string);
        } else {
            if (z10 || !z11) {
                typedArrayObtainAttributes.recycle();
                if (!z10) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f24712a = c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(d3.s.f22868d);
        this.f24713b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static d3.g[] c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        d3.g[] gVarArr = new d3.g[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    gVarArr[i10] = new d3.g("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22837i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22839k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22838j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22840l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22841m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22843o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22842n;
            } else if ("FLUID".equals(strTrim)) {
                gVarArr[i10] = d3.g.f22844p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                gVarArr[i10] = d3.g.f22847s;
            }
        }
        if (length != 0) {
            return gVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.f24713b;
    }

    public final d3.g[] b(boolean z10) {
        if (z10 || this.f24712a.length == 1) {
            return this.f24712a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
