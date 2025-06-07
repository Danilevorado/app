package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ln2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11674b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11677e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11678f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11679g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11680h;

    /* renamed from: i, reason: collision with root package name */
    public final jn2 f11681i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f11682j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11683k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11684l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11685m;

    ln2(JsonReader jsonReader) throws IOException {
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String str = strNextString3;
        jn2 jn2Var = null;
        long jNextLong = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        String strNextString4 = str;
        String strNextString5 = strNextString4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String strNextString6 = str;
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = m3.w0.d(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString5 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                String str2 = strNextString3;
                if (((Boolean) k3.w.c().b(ir.K7)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    jn2Var = new jn2(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString = jsonReader.nextString();
                } else if ("adapter_response_replacement_key".equals(strNextName)) {
                    strNextString6 = jsonReader.nextString();
                } else {
                    if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) k3.w.c().b(ir.f10138x6)).booleanValue()) {
                            try {
                                Bundle bundleA = m3.w0.a(m3.w0.h(jsonReader));
                                if (bundleA != null) {
                                    bundle = bundleA;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) k3.w.c().b(ir.E8)).booleanValue()) {
                                strNextString3 = jsonReader.nextString();
                            }
                        } else if ("adRequestUrl".equals(strNextName)) {
                            if (((Boolean) k3.w.c().b(ir.E8)).booleanValue()) {
                                strNextString2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.skipValue();
                    }
                    str = strNextString6;
                }
                strNextString3 = str2;
                str = strNextString6;
            }
            str = strNextString6;
        }
        jsonReader.endObject();
        this.f11673a = listEmptyList;
        this.f11675c = iNextInt;
        this.f11674b = strNextString4;
        this.f11676d = strNextString5;
        this.f11677e = iNextInt2;
        this.f11678f = jNextLong;
        this.f11681i = jn2Var;
        this.f11679g = zNextBoolean;
        this.f11680h = strNextString;
        this.f11682j = bundle;
        this.f11683k = strNextString2;
        this.f11684l = strNextString3;
        this.f11685m = str;
    }
}
