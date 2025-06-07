package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class jn1 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f10593a;

    public jn1(i4.e eVar) {
        this.f10593a = eVar;
    }

    public final void a(List list, String str, String str2, Object... objArr) throws IOException {
        if (((Boolean) ht.f9410a.e()).booleanValue()) {
            long jA = this.f10593a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jA);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = objArr[i10];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e5) {
                ze0.e("unable to log", e5);
            }
            ze0.f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
