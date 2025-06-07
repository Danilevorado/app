package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class aw1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6271a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Map f6272b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public String f6273c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f6274d = -1;

    public static aw1 a(Reader reader) throws IOException {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                long jNextLong = -1;
                String strNextString = "";
                jsonReader.beginObject();
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), m3.w0.d(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                aw1 aw1Var = new aw1();
                aw1Var.f6271a = iNextInt;
                if (strNextString != null) {
                    aw1Var.f6273c = strNextString;
                }
                aw1Var.f6274d = jNextLong;
                aw1Var.f6272b = map;
                return aw1Var;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e5) {
                throw new mn2("Unable to parse Response", e5);
            }
        } finally {
            i4.k.a(reader);
        }
    }
}
