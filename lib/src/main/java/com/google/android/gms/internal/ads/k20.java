package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class k20 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f10785a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final h20 f10786b = new j20();

    /* renamed from: c, reason: collision with root package name */
    public static final f20 f10787c = new f20() { // from class: com.google.android.gms.internal.ads.i20
        @Override // com.google.android.gms.internal.ads.f20
        public final Object a(JSONObject jSONObject) {
            return k20.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f10785a));
    }
}
