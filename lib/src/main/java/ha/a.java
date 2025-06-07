package ha;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements ha.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f24126a;

    /* renamed from: c, reason: collision with root package name */
    private final Context f24128c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24129d;

    /* renamed from: e, reason: collision with root package name */
    private final v9.a f24130e;

    /* renamed from: f, reason: collision with root package name */
    private final da.a f24131f;

    /* renamed from: g, reason: collision with root package name */
    private final cb.a f24132g;

    /* renamed from: h, reason: collision with root package name */
    private final d8.c f24133h;

    /* renamed from: i, reason: collision with root package name */
    private final fa.b f24134i;

    /* renamed from: j, reason: collision with root package name */
    private final String f24135j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24136k;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f24127b = new Handler();

    /* renamed from: m, reason: collision with root package name */
    private final BroadcastReceiver f24138m = k();

    /* renamed from: n, reason: collision with root package name */
    private final BroadcastReceiver f24139n = a();

    /* renamed from: l, reason: collision with root package name */
    private final int f24137l = Process.myPid();

    /* renamed from: ha.a$a, reason: collision with other inner class name */
    class C0143a extends BroadcastReceiver {
        C0143a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a.this.f(intent);
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a.this.y(intent);
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f24142m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ byte[] f24143n;

        c(String str, byte[] bArr) {
            this.f24142m = str;
            this.f24143n = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.w(this.f24142m, this.f24143n);
        }
    }

    class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Intent f24145m;

        d(Intent intent) {
            this.f24145m = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.n(this.f24145m);
        }
    }

    class e implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f24147m;

        e(String str) {
            this.f24147m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.v(this.f24147m);
        }
    }

    class f implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f24149m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ byte[] f24150n;

        f(String str, byte[] bArr) {
            this.f24149m = str;
            this.f24150n = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.E(this.f24149m, this.f24150n);
        }
    }

    class g implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f24152m;

        g(String str) {
            this.f24152m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.D(this.f24152m);
        }
    }

    public a(Context context, String str, v9.a aVar, da.a aVar2, cb.a aVar3, d8.c cVar, fa.b bVar, ra.b bVar2, Map map) {
        this.f24128c = context;
        this.f24129d = str;
        this.f24130e = aVar;
        this.f24131f = aVar2;
        this.f24132g = aVar3;
        this.f24133h = cVar;
        this.f24134i = bVar;
        this.f24135j = m(bVar2);
        this.f24136k = d(bVar2);
        this.f24126a = e(str, map);
    }

    private void A(String str, byte[] bArr) {
        this.f24133h.submit(new c(str, bArr));
    }

    private void B(String str) {
        this.f24133h.submit(new g(str));
    }

    private void C(String str, byte[] bArr) {
        this.f24133h.submit(new f(str, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        Intent intent = new Intent(this.f24136k);
        intent.putExtra("preference_process_id", this.f24137l);
        intent.putExtra("preference_name", this.f24129d);
        intent.putExtra("preference_key", str);
        this.f24128c.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str, byte[] bArr) {
        Intent intent = new Intent(this.f24135j);
        intent.putExtra("preference_process_id", this.f24137l);
        intent.putExtra("preference_name", this.f24129d);
        intent.putExtra("preference_key", str);
        intent.putExtra("preference_value", bArr);
        this.f24128c.sendBroadcast(intent);
    }

    private BroadcastReceiver a() {
        return new C0143a();
    }

    private String d(ra.b bVar) {
        return "com.ironz.binaryprefs.ACTION_PREFERENCE_REMOVED_" + bVar.c().getAbsolutePath();
    }

    private List e(String str, Map map) {
        if (map.containsKey(str)) {
            return (List) map.get(str);
        }
        ArrayList arrayList = new ArrayList();
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Intent intent) {
        if (this.f24129d.equals(intent.getStringExtra("preference_name")) && this.f24137l != intent.getIntExtra("preference_process_id", 0)) {
            t(intent);
        }
    }

    private void j(String str, Object obj) {
        this.f24130e.c(str);
        this.f24131f.b(str, obj);
        r(str);
    }

    private BroadcastReceiver k() {
        return new b();
    }

    private Object l(String str, byte[] bArr) {
        return this.f24132g.c(str, this.f24134i.b(bArr));
    }

    private String m(ra.b bVar) {
        return "com.ironz.binaryprefs.ACTION_PREFERENCE_UPDATED_" + bVar.c().getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Intent intent) {
        z(intent.getStringExtra("preference_key"));
    }

    private void r(String str) {
        this.f24127b.post(new e(str));
    }

    private void s() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f24128c.registerReceiver(this.f24138m, new IntentFilter(this.f24135j), 4);
            this.f24128c.registerReceiver(this.f24139n, new IntentFilter(this.f24136k), 4);
        } else {
            this.f24128c.registerReceiver(this.f24138m, new IntentFilter(this.f24135j));
            this.f24128c.registerReceiver(this.f24139n, new IntentFilter(this.f24136k));
        }
    }

    private void t(Intent intent) {
        this.f24133h.submit(new d(intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        Iterator it = this.f24126a.iterator();
        while (it.hasNext()) {
            ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(null, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, byte[] bArr) {
        j(str, l(str, bArr));
    }

    private void x() {
        this.f24128c.unregisterReceiver(this.f24138m);
        this.f24128c.unregisterReceiver(this.f24139n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Intent intent) {
        if (this.f24129d.equals(intent.getStringExtra("preference_name")) && this.f24137l != intent.getIntExtra("preference_process_id", 0)) {
            A(intent.getStringExtra("preference_key"), intent.getByteArrayExtra("preference_value"));
        }
    }

    private void z(String str) {
        this.f24130e.remove(str);
        this.f24131f.remove(str);
        r(str);
    }

    @Override // ha.b
    public void b(String str, byte[] bArr) {
        r(str);
        C(str, bArr);
    }

    @Override // ha.b
    public void c(String str) {
        r(str);
        B(str);
    }

    @Override // ha.b
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (this.f24126a.isEmpty()) {
            s();
        }
        this.f24126a.add(onSharedPreferenceChangeListener);
    }

    @Override // ha.b
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24126a.remove(onSharedPreferenceChangeListener);
        if (this.f24126a.isEmpty()) {
            x();
        }
    }
}
