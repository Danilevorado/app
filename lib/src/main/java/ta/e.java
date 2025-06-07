package ta;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27398a = "c";

    private static JSONObject a(StackTraceElement stackTraceElement) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("class_name", stackTraceElement.getClassName());
        jSONObject.put("filename", stackTraceElement.getFileName());
        jSONObject.put("method", stackTraceElement.getMethodName());
        if (stackTraceElement.getLineNumber() > 0) {
            jSONObject.put("lineno", stackTraceElement.getLineNumber());
        }
        return jSONObject;
    }

    private static JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("application", str);
        jSONObject.put("hwid", str2);
        return jSONObject;
    }

    private static JSONObject c(Throwable th) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trace_chain", g(th));
            return jSONObject;
        } catch (JSONException e5) {
            k9.h.x(f27398a, e5.getMessage());
            return null;
        }
    }

    public static JSONObject d(Throwable th, String str, String str2, String str3, boolean z10, boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("environment", "production");
        jSONObject2.put("body", c(th));
        jSONObject2.put("level", "error");
        jSONObject2.put("code_version", "6.7.10");
        jSONObject2.put("platform", "android");
        jSONObject2.put("language", "java");
        jSONObject2.put("framework", str3);
        jSONObject2.put("client", e(z10, z11));
        jSONObject2.put("custom", b(str, str2));
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    private static JSONObject e(boolean z10, boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
        JSONObject jSONObject2 = new JSONObject();
        if (z10) {
            jSONObject2.put("device_model", Build.MODEL);
        }
        if (z11) {
            jSONObject2.put("android_version", Build.VERSION.RELEASE);
        }
        jSONObject.put("android", jSONObject2);
        return jSONObject;
    }

    private static JSONObject f(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("class", th.getClass().getName());
        jSONObject.put("message", th.getMessage());
        return jSONObject;
    }

    private static JSONArray g(Throwable th) {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(0, h(th));
            th = th.getCause();
        } while (th != null);
        return new JSONArray((Collection) arrayList);
    }

    private static JSONObject h(Throwable th) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            jSONArray.put(a(stackTrace[length]));
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            th.printStackTrace(printStream);
            printStream.close();
            byteArrayOutputStream.close();
            jSONObject.put("raw", byteArrayOutputStream.toString("UTF-8"));
        } catch (Exception e5) {
            k9.h.x(f27398a, e5.getMessage());
        }
        jSONObject.put("frames", jSONArray);
        jSONObject.put("exception", f(th));
        return jSONObject;
    }
}
