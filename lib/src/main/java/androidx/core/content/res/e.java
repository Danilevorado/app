package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f2165a;

        public c(d[] dVarArr) {
            this.f2165a = dVarArr;
        }

        public d[] a() {
            return this.f2165a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f2166a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2167b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2168c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2169d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2170e;

        /* renamed from: f, reason: collision with root package name */
        private final int f2171f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f2166a = str;
            this.f2167b = i10;
            this.f2168c = z10;
            this.f2169d = str2;
            this.f2170e = i11;
            this.f2171f = i12;
        }

        public String a() {
            return this.f2166a;
        }

        public int b() {
            return this.f2171f;
        }

        public int c() {
            return this.f2170e;
        }

        public String d() {
            return this.f2169d;
        }

        public int e() {
            return this.f2167b;
        }

        public boolean f() {
            return this.f2168c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0023e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f2172a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2173b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2174c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2175d;

        public C0023e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f2172a = eVar;
            this.f2174c = i10;
            this.f2173b = i11;
            this.f2175d = str;
        }

        public int a() {
            return this.f2174c;
        }

        public androidx.core.provider.e b() {
            return this.f2172a;
        }

        public String c() {
            return this.f2175d;
        }

        public int d() {
            return this.f2173b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), y.d.f28413h);
        String string = typedArrayObtainAttributes.getString(y.d.f28414i);
        String string2 = typedArrayObtainAttributes.getString(y.d.f28418m);
        String string3 = typedArrayObtainAttributes.getString(y.d.f28419n);
        int resourceId = typedArrayObtainAttributes.getResourceId(y.d.f28415j, 0);
        int integer = typedArrayObtainAttributes.getInteger(y.d.f28416k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(y.d.f28417l, 500);
        String string4 = typedArrayObtainAttributes.getString(y.d.f28420o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0023e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), y.d.f28421p);
        int i10 = y.d.f28430y;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = y.d.f28423r;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = y.d.f28428w;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = y.d.f28424s;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = y.d.f28431z;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = y.d.f28425t;
        }
        int i14 = y.d.f28429x;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = y.d.f28426u;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = y.d.f28427v;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = y.d.f28422q;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
