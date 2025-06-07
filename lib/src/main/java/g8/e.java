package g8;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23888a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f23889b = 1;

    public static String A(Bundle bundle) {
        return bundle.getString("pw_channel");
    }

    public static int B(Bundle bundle) {
        int i10 = f23888a;
        int iG = g(bundle, "pri", i10);
        if (Math.abs(iG) <= 2) {
            return iG;
        }
        k9.h.w("Unsupported priority: " + iG + ", setting to default: 0");
        return i10;
    }

    public static String C(Bundle bundle) {
        return bundle.getString("p");
    }

    public static String D(Bundle bundle) {
        return bundle.getString("md");
    }

    public static String E(Bundle bundle) {
        return bundle.getString("rm");
    }

    public static int F(Bundle bundle) {
        return z7.f.n(bundle.getString("i"));
    }

    public static String G(Bundle bundle) {
        return bundle.getString("s");
    }

    public static String H(Bundle bundle) {
        return bundle.getString("value");
    }

    public static boolean I(Bundle bundle) {
        String string = bundle.getString("vib");
        return !TextUtils.isEmpty(string) && string.equals("1");
    }

    public static int J(Bundle bundle) {
        int i10 = f23889b;
        int iG = g(bundle, "visibility", i10);
        if (Math.abs(iG) <= 1) {
            return iG;
        }
        k9.h.w("Unsupported visibility: " + iG + ", setting to default: 1");
        return i10;
    }

    public static boolean a(Bundle bundle) {
        String string = bundle.getString("pw_badges");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        return string.charAt(0) == '-' || string.charAt(0) == '+';
    }

    public static boolean b(Bundle bundle) {
        return bundle.getBoolean("local", false);
    }

    public static boolean c(Bundle bundle) {
        return k(bundle, "pw_lockscreen");
    }

    public static boolean d(Bundle bundle) {
        return k(bundle, "silent") || k(bundle, "pw_silent");
    }

    public static boolean e(Bundle bundle) {
        return j(bundle, 2);
    }

    public static boolean f(Bundle bundle) {
        return j(bundle, 1);
    }

    private static int g(Bundle bundle, String str, int i10) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return (string == null || !string.isEmpty()) ? bundle.getInt(str, i10) : i10;
        }
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            k9.h.k("ERROR! Incorrect format for key [ " + str + " ]: " + string);
            return i10;
        }
    }

    public static JSONObject h(Bundle bundle) {
        return k9.b.g(bundle);
    }

    public static void i(Bundle bundle, boolean z10) {
        bundle.putBoolean("foreground", z10);
        bundle.putBoolean("onStart", !z10);
    }

    private static boolean j(Bundle bundle, int i10) {
        return g(bundle, "pw_msg", 0) == i10;
    }

    private static boolean k(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (TextUtils.equals(string, "true")) {
            return true;
        }
        try {
            return Integer.parseInt(string) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Collection l(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        try {
            String string = bundle.getString("pw_actions");
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(new w9.a(jSONArray.getJSONObject(i10)));
                }
            }
        } catch (JSONException e5) {
            k9.h.o(e5);
        }
        return arrayList;
    }

    public static int m(Bundle bundle) {
        return g(bundle, "pw_badges", -1);
    }

    public static String n(Bundle bundle) {
        return bundle.getString("b");
    }

    public static String o(Bundle bundle) {
        return bundle.getString("u");
    }

    public static String p(Bundle bundle) {
        return bundle.getString("group_id", "group_undefined");
    }

    public static String q(Bundle bundle) {
        String str = (String) bundle.get("header");
        if (str != null) {
            return str;
        }
        CharSequence charSequenceG = c9.a.a().g();
        if (charSequenceG == null) {
            charSequenceG = "";
        }
        return charSequenceG.toString();
    }

    public static Integer r(Bundle bundle) {
        String string = bundle.getString("ibc");
        return Integer.valueOf(string != null ? Color.parseColor(string) : ka.e.d().e().a());
    }

    public static String s(Bundle bundle) {
        return bundle.getString("pw_command");
    }

    public static String t(Bundle bundle) {
        return bundle.getString("ci");
    }

    public static Integer u(Bundle bundle) {
        String string = bundle.getString("led");
        if (string != null) {
            return Integer.valueOf(g9.a.i(string));
        }
        return null;
    }

    public static int v(Bundle bundle) {
        return g(bundle, "led_off_ms", AdError.NETWORK_ERROR_CODE);
    }

    public static int w(Bundle bundle) {
        return g(bundle, "led_on_ms", 100);
    }

    public static String x(Bundle bundle) {
        return bundle.getString("l");
    }

    public static String y(Bundle bundle) {
        return bundle.getString("title");
    }

    public static String z(Bundle bundle) {
        return bundle.getString("pw_msg_tag");
    }
}
