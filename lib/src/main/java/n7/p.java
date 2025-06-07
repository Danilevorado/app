package n7;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class p implements z7.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25579a;

    /* renamed from: b, reason: collision with root package name */
    private String f25580b;

    /* renamed from: c, reason: collision with root package name */
    private String f25581c;

    /* renamed from: d, reason: collision with root package name */
    private String f25582d;

    /* renamed from: e, reason: collision with root package name */
    private String f25583e;

    /* renamed from: f, reason: collision with root package name */
    private String f25584f;

    /* renamed from: g, reason: collision with root package name */
    private String f25585g;

    /* renamed from: h, reason: collision with root package name */
    private String[] f25586h;

    /* renamed from: i, reason: collision with root package name */
    private Class f25587i;

    /* renamed from: j, reason: collision with root package name */
    private Class f25588j;

    /* renamed from: k, reason: collision with root package name */
    private Class f25589k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25590l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f25591m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25592n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25593o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25594p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25595q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25596r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f25597s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25598t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f25599u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f25600v;

    /* renamed from: w, reason: collision with root package name */
    private int f25601w;

    /* renamed from: x, reason: collision with root package name */
    private int f25602x;

    /* renamed from: y, reason: collision with root package name */
    private final List f25603y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    private w8.b f25604z;

    p() {
        Bundle bundle;
        this.f25579a = null;
        this.f25580b = null;
        this.f25581c = null;
        this.f25582d = null;
        this.f25583e = null;
        this.f25584f = null;
        this.f25585g = null;
        this.f25586h = new String[0];
        this.f25590l = false;
        this.f25591m = false;
        this.f25592n = false;
        this.f25593o = false;
        this.f25594p = true;
        this.f25595q = false;
        this.f25596r = false;
        this.f25597s = true;
        this.f25598t = true;
        this.f25599u = true;
        this.f25600v = false;
        this.f25601w = 0;
        this.f25602x = 0;
        ApplicationInfo applicationInfoE = c9.a.a().e();
        if (applicationInfoE == null || (bundle = applicationInfoE.metaData) == null) {
            k9.h.x("Config", "no metadata found");
            return;
        }
        this.f25579a = A(bundle, "com.pushwoosh.appid", "PW_APPID");
        this.f25580b = A(applicationInfoE.metaData, "com.pushwoosh.senderid", "PW_PROJECT_ID");
        this.f25581c = A(applicationInfoE.metaData, "com.pushwoosh.xiaomiappid", "XM_APPID");
        this.f25582d = A(applicationInfoE.metaData, "com.pushwoosh.xiaomiappkey", "XM_APPKEY");
        this.f25583e = A(applicationInfoE.metaData, "com.pushwoosh.xiaomiappregion", "XM_APPREGION");
        String strA = A(applicationInfoE.metaData, "com.pushwoosh.trusted_package_names", null);
        if (!TextUtils.isEmpty(strA)) {
            this.f25586h = strA.split(",");
        }
        if (this.f25586h.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr = this.f25586h;
                if (i10 >= strArr.length) {
                    break;
                }
                strArr[i10] = strArr[i10].trim();
                i10++;
            }
        }
        if (!TextUtils.isEmpty(this.f25580b) && !Character.isDigit(this.f25580b.charAt(0))) {
            this.f25580b = this.f25580b.substring(1);
        }
        this.f25584f = A(applicationInfoE.metaData, "com.pushwoosh.log_level", "PW_LOG_LEVEL");
        this.f25585g = A(applicationInfoE.metaData, "com.pushwoosh.base_url", "PushwooshUrl");
        this.f25587i = z(applicationInfoE.metaData, "com.pushwoosh.notification_service_extension");
        this.f25588j = z(applicationInfoE.metaData, "com.pushwoosh.notification_factory");
        this.f25589k = z(applicationInfoE.metaData, "com.pushwoosh.summary_notification_factory");
        this.f25590l = applicationInfoE.metaData.getBoolean("com.pushwoosh.lazy_initialization", false);
        this.f25591m = applicationInfoE.metaData.getBoolean("com.pushwoosh.multi_notification_mode", false);
        this.f25592n = applicationInfoE.metaData.getBoolean("com.pushwoosh.light_screen_notification", false);
        this.f25593o = applicationInfoE.metaData.getBoolean("com.pushwoosh.send_push_stats_if_alert_disabled", false);
        this.f25594p = applicationInfoE.metaData.getBoolean("com.pushwoosh.allow_server_communication", true);
        this.f25595q = applicationInfoE.metaData.getBoolean("com.pushwoosh.foreground_push", false);
        this.f25596r = applicationInfoE.metaData.getBoolean("com.pushwoosh.handle_notifications_using_workmanager", false);
        this.f25600v = applicationInfoE.metaData.getBoolean("com.pushwoosh.show_fullscreen_richmedia", true);
        String string = applicationInfoE.metaData.getString("com.pushwoosh.notification_icon");
        if (string != null) {
            this.f25601w = c9.a.j().b(z7.e.f(z7.e.c(string)), "drawable");
        }
        this.f25602x = applicationInfoE.metaData.getInt("com.pushwoosh.notification_icon_color", 0);
        for (String str : applicationInfoE.metaData.keySet()) {
            if (str.startsWith("com.pushwoosh.plugin.")) {
                try {
                    Class clsZ = z(applicationInfoE.metaData, str);
                    if (clsZ != null) {
                        this.f25603y.add((w8.a) clsZ.newInstance());
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            Class clsZ2 = z(applicationInfoE.metaData, "com.pushwoosh.internal.plugin_provider");
            if (clsZ2 != null) {
                this.f25604z = (w8.b) clsZ2.newInstance();
            }
        } catch (Exception unused2) {
        }
        if (this.f25604z == null) {
            this.f25604z = new ia.a();
        }
        if (applicationInfoE.metaData.getBoolean("com.pushwoosh.allow_collecting_device_data", true)) {
            this.f25597s = applicationInfoE.metaData.getBoolean("com.pushwoosh.allow_collecting_device_os_version", true);
            this.f25598t = applicationInfoE.metaData.getBoolean("com.pushwoosh.allow_collecting_device_locale", true);
            this.f25599u = applicationInfoE.metaData.getBoolean("com.pushwoosh.allow_collecting_device_model", true);
        } else {
            this.f25597s = false;
            this.f25598t = false;
            this.f25599u = false;
        }
    }

    private String A(Bundle bundle, String str, String str2) {
        String string = bundle.getString(str);
        if (string == null && (string = bundle.getString(str2)) != null) {
            k9.h.w("'" + str2 + "' is deprecated consider using '" + str + "'");
        }
        return string;
    }

    private Class z(Bundle bundle, String str) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String string = bundle.getString(str);
        if (string != null && string.startsWith(".")) {
            string = c9.a.a().d() + string;
        }
        if (string == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string);
            cls.getConstructor(new Class[0]);
            return cls;
        } catch (ClassNotFoundException e5) {
            k9.h.o(e5);
            throw new IllegalStateException("Could not find class for name: " + string);
        } catch (NoSuchMethodException e10) {
            k9.h.o(e10);
            throw new IllegalStateException("Could not find public default constructor for class: " + string);
        }
    }

    public void B(boolean z10) {
        this.f25590l = z10;
    }

    public boolean C() {
        return this.f25590l;
    }

    @Override // z7.d
    public String a() {
        return this.f25585g;
    }

    @Override // z7.d
    public String b() {
        return this.f25582d;
    }

    @Override // z7.d
    public String[] c() {
        return this.f25586h;
    }

    @Override // z7.d
    public boolean d() {
        return this.f25592n;
    }

    @Override // z7.d
    public Class e() {
        return this.f25589k;
    }

    @Override // z7.d
    public boolean f() {
        return this.f25599u;
    }

    @Override // z7.d
    public boolean g() {
        return this.f25593o;
    }

    @Override // z7.d
    public Class h() {
        return this.f25588j;
    }

    @Override // z7.d
    public int i() {
        return this.f25602x;
    }

    @Override // z7.d
    public boolean j() {
        return this.f25594p;
    }

    @Override // z7.d
    public String k() {
        return this.f25581c;
    }

    @Override // z7.d
    public boolean l() {
        return this.f25597s;
    }

    @Override // z7.d
    public String m() {
        return this.f25579a;
    }

    @Override // z7.d
    public boolean n() {
        return this.f25600v;
    }

    @Override // z7.d
    public Class o() {
        return this.f25587i;
    }

    @Override // z7.d
    public String p() {
        return this.f25583e;
    }

    @Override // z7.d
    public Collection q() {
        return this.f25603y;
    }

    @Override // z7.d
    public int r() {
        return this.f25601w;
    }

    @Override // z7.d
    public boolean s() {
        return this.f25596r;
    }

    @Override // z7.d
    public w8.b t() {
        return this.f25604z;
    }

    @Override // z7.d
    public boolean u() {
        return this.f25595q;
    }

    @Override // z7.d
    public String v() {
        return this.f25584f;
    }

    @Override // z7.d
    public boolean w() {
        return this.f25598t;
    }

    @Override // z7.d
    public String x() {
        return this.f25580b;
    }

    @Override // z7.d
    public boolean y() {
        return this.f25591m;
    }
}
