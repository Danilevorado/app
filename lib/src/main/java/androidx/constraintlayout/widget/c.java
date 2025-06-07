package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f1637a;

    /* renamed from: b, reason: collision with root package name */
    int f1638b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f1639c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray f1640d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f1641e = new SparseArray();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1642a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f1643b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f1644c;

        /* renamed from: d, reason: collision with root package name */
        d f1645d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1644c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.E6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.F6) {
                    this.f1642a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1642a);
                } else if (index == g.G6) {
                    this.f1644c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1644c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1644c);
                    context.getResources().getResourceName(this.f1644c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1645d = dVar;
                        dVar.f(context, this.f1644c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1643b.add(bVar);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f1646a;

        /* renamed from: b, reason: collision with root package name */
        float f1647b;

        /* renamed from: c, reason: collision with root package name */
        float f1648c;

        /* renamed from: d, reason: collision with root package name */
        float f1649d;

        /* renamed from: e, reason: collision with root package name */
        int f1650e;

        /* renamed from: f, reason: collision with root package name */
        d f1651f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1646a = Float.NaN;
            this.f1647b = Float.NaN;
            this.f1648c = Float.NaN;
            this.f1649d = Float.NaN;
            this.f1650e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f1785c7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1794d7) {
                    this.f1650e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1650e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1650e);
                    context.getResources().getResourceName(this.f1650e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1651f = dVar;
                        dVar.f(context, this.f1650e);
                    }
                } else if (index == g.f1802e7) {
                    this.f1649d = typedArrayObtainStyledAttributes.getDimension(index, this.f1649d);
                } else if (index == g.f1810f7) {
                    this.f1647b = typedArrayObtainStyledAttributes.getDimension(index, this.f1647b);
                } else if (index == g.f1819g7) {
                    this.f1648c = typedArrayObtainStyledAttributes.getDimension(index, this.f1648c);
                } else if (index == g.f1828h7) {
                    this.f1646a = typedArrayObtainStyledAttributes.getDimension(index, this.f1646a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f1637a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r9, int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        Ld:
            r2 = 1
            if (r1 == r2) goto L8c
            if (r1 == 0) goto L7b
            r3 = 2
            if (r1 == r3) goto L17
            goto L7e
        L17:
            java.lang.String r1 = r10.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r4 = -1
            int r5 = r1.hashCode()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L4d;
                case 80204913: goto L43;
                case 1382829617: goto L3a;
                case 1657696882: goto L30;
                case 1901439077: goto L26;
                default: goto L25;
            }     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L25:
            goto L57
        L26:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = r7
            goto L58
        L30:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = 0
            goto L58
        L3a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            goto L58
        L43:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = r3
            goto L58
        L4d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = r6
            goto L58
        L57:
            r2 = r4
        L58:
            if (r2 == r3) goto L6e
            if (r2 == r7) goto L63
            if (r2 == r6) goto L5f
            goto L7e
        L5f:
            r8.b(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L63:
            androidx.constraintlayout.widget.c$b r1 = new androidx.constraintlayout.widget.c$b     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L7e
            r0.a(r1)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L6e:
            androidx.constraintlayout.widget.c$a r0 = new androidx.constraintlayout.widget.c$a     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            android.util.SparseArray r1 = r8.f1640d     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            int r2 = r0.f1642a     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.put(r2, r0)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L7b:
            r10.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L7e:
            int r1 = r10.next()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto Ld
        L83:
            r9 = move-exception
            r9.printStackTrace()
            goto L8c
        L88:
            r9 = move-exception
            r9.printStackTrace()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.m(context, xmlPullParser);
                this.f1641e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }
}
