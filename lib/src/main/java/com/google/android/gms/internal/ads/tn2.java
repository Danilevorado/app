package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tn2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f15923a;

    /* renamed from: b, reason: collision with root package name */
    public final ln2 f15924b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15925c;

    tn2(JsonReader jsonReader) throws IOException {
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ln2 ln2Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new hn2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        ln2Var = new ln2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectH = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectH = m3.w0.h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new sn2(strNextString, jSONObjectH));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f15925c = arrayList;
        this.f15923a = listEmptyList;
        this.f15924b = ln2Var == null ? new ln2(new JsonReader(new StringReader("{}"))) : ln2Var;
    }

    public static tn2 a(Reader reader) throws IOException {
        try {
            try {
                return new tn2(new JsonReader(reader));
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e5) {
                throw new mn2("unable to parse ServerResponse", e5);
            }
        } finally {
            i4.k.a(reader);
        }
    }
}
