package u1;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class m implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f27565d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f27566e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f27567f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f27568g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f27569h;

    /* renamed from: a, reason: collision with root package name */
    private final c f27570a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g f27571b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final Map f27572c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27573a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f27573a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27573a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27573a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27573a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final c f27574a;

        /* renamed from: b, reason: collision with root package name */
        int f27575b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f27576c;

        public b(c cVar) {
            this.f27574a = cVar;
        }

        @Override // u1.l
        public void a() {
            this.f27574a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f27575b = i10;
            this.f27576c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f27575b == bVar.f27575b && n2.l.c(this.f27576c, bVar.f27576c);
        }

        public int hashCode() {
            int i10 = this.f27575b * 31;
            Bitmap.Config config = this.f27576c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.i(this.f27575b, this.f27576c);
        }
    }

    static class c extends u1.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f27565d = configArr;
        f27566e = configArr;
        f27567f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f27568g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f27569h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void g(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapK = k(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapK.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapK.remove(num);
                return;
            } else {
                navigableMapK.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + f(bitmap) + ", this: " + this);
    }

    private b h(int i10, Bitmap.Config config) {
        b bVarE = this.f27570a.e(i10, config);
        for (Bitmap.Config config2 : j(config)) {
            Integer num = (Integer) k(config2).ceilingKey(Integer.valueOf(i10));
            if (num != null && num.intValue() <= i10 * 8) {
                if (num.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f27570a.c(bVarE);
                return this.f27570a.e(num.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String i(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f27566e;
        }
        int i10 = a.f27573a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f27569h : f27568g : f27567f : f27565d;
    }

    private NavigableMap k(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f27572c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f27572c.put(config, treeMap);
        return treeMap;
    }

    @Override // u1.k
    public String a(int i10, int i11, Bitmap.Config config) {
        return i(n2.l.f(i10, i11, config), config);
    }

    @Override // u1.k
    public int b(Bitmap bitmap) {
        return n2.l.g(bitmap);
    }

    @Override // u1.k
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        b bVarH = h(n2.l.f(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f27571b.a(bVarH);
        if (bitmap != null) {
            g(Integer.valueOf(bVarH.f27575b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // u1.k
    public void d(Bitmap bitmap) {
        b bVarE = this.f27570a.e(n2.l.g(bitmap), bitmap.getConfig());
        this.f27571b.d(bVarE, bitmap);
        NavigableMap navigableMapK = k(bitmap.getConfig());
        Integer num = (Integer) navigableMapK.get(Integer.valueOf(bVarE.f27575b));
        navigableMapK.put(Integer.valueOf(bVarE.f27575b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // u1.k
    public Bitmap e() {
        Bitmap bitmap = (Bitmap) this.f27571b.f();
        if (bitmap != null) {
            g(Integer.valueOf(n2.l.g(bitmap)), bitmap);
        }
        return bitmap;
    }

    @Override // u1.k
    public String f(Bitmap bitmap) {
        return i(n2.l.g(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f27571b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f27572c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f27572c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
