package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8957a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f8958b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f8959c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.c2 a(java.lang.String r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h2.a(java.lang.String):com.google.android.gms.internal.ads.c2");
    }

    private static c63 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        z53 z53Var = new z53();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (sw2.c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strA = sw2.a(xmlPullParser, strConcat2);
                String strA2 = sw2.a(xmlPullParser, strConcat3);
                String strA3 = sw2.a(xmlPullParser, strConcat4);
                String strA4 = sw2.a(xmlPullParser, strConcat5);
                if (strA == null || strA2 == null) {
                    return c63.u();
                }
                z53Var.g(new b2(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!sw2.b(xmlPullParser, str.concat(":Directory")));
        return z53Var.j();
    }
}
