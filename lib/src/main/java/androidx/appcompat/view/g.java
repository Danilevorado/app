package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.z0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f678e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f679f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f680a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f681b;

    /* renamed from: c, reason: collision with root package name */
    Context f682c;

    /* renamed from: d, reason: collision with root package name */
    private Object f683d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f684c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f685a;

        /* renamed from: b, reason: collision with root package name */
        private Method f686b;

        public a(Object obj, String str) {
            this.f685a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f686b = cls.getMethod(str, f684c);
            } catch (Exception e5) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f686b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f686b.invoke(this.f685a, menuItem)).booleanValue();
                }
                this.f686b.invoke(this.f685a, menuItem);
                return true;
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f687a;

        /* renamed from: b, reason: collision with root package name */
        private int f688b;

        /* renamed from: c, reason: collision with root package name */
        private int f689c;

        /* renamed from: d, reason: collision with root package name */
        private int f690d;

        /* renamed from: e, reason: collision with root package name */
        private int f691e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f692f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f693g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f694h;

        /* renamed from: i, reason: collision with root package name */
        private int f695i;

        /* renamed from: j, reason: collision with root package name */
        private int f696j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f697k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f698l;

        /* renamed from: m, reason: collision with root package name */
        private int f699m;

        /* renamed from: n, reason: collision with root package name */
        private char f700n;

        /* renamed from: o, reason: collision with root package name */
        private int f701o;

        /* renamed from: p, reason: collision with root package name */
        private char f702p;

        /* renamed from: q, reason: collision with root package name */
        private int f703q;

        /* renamed from: r, reason: collision with root package name */
        private int f704r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f705s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f706t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f707u;

        /* renamed from: v, reason: collision with root package name */
        private int f708v;

        /* renamed from: w, reason: collision with root package name */
        private int f709w;

        /* renamed from: x, reason: collision with root package name */
        private String f710x;

        /* renamed from: y, reason: collision with root package name */
        private String f711y;

        /* renamed from: z, reason: collision with root package name */
        private String f712z;

        public b(Menu menu) {
            this.f687a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f682c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e5) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f705s).setVisible(this.f706t).setEnabled(this.f707u).setCheckable(this.f704r >= 1).setTitleCondensed(this.f698l).setIcon(this.f699m);
            int i10 = this.f708v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f712z != null) {
                if (g.this.f682c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f712z));
            }
            if (this.f704r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f710x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f678e, g.this.f680a));
                z10 = true;
            }
            int i11 = this.f709w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                androidx.core.view.j.a(menuItem, bVar);
            }
            androidx.core.view.j.c(menuItem, this.B);
            androidx.core.view.j.g(menuItem, this.C);
            androidx.core.view.j.b(menuItem, this.f700n, this.f701o);
            androidx.core.view.j.f(menuItem, this.f702p, this.f703q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                androidx.core.view.j.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                androidx.core.view.j.d(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f694h = true;
            i(this.f687a.add(this.f688b, this.f695i, this.f696j, this.f697k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f694h = true;
            SubMenu subMenuAddSubMenu = this.f687a.addSubMenu(this.f688b, this.f695i, this.f696j, this.f697k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f694h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f682c.obtainStyledAttributes(attributeSet, f.j.f23496o1);
            this.f688b = typedArrayObtainStyledAttributes.getResourceId(f.j.f23506q1, 0);
            this.f689c = typedArrayObtainStyledAttributes.getInt(f.j.f23516s1, 0);
            this.f690d = typedArrayObtainStyledAttributes.getInt(f.j.f23521t1, 0);
            this.f691e = typedArrayObtainStyledAttributes.getInt(f.j.f23526u1, 0);
            this.f692f = typedArrayObtainStyledAttributes.getBoolean(f.j.f23511r1, true);
            this.f693g = typedArrayObtainStyledAttributes.getBoolean(f.j.f23501p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            z0 z0VarU = z0.u(g.this.f682c, attributeSet, f.j.f23531v1);
            this.f695i = z0VarU.n(f.j.f23546y1, 0);
            this.f696j = (z0VarU.k(f.j.B1, this.f689c) & (-65536)) | (z0VarU.k(f.j.C1, this.f690d) & 65535);
            this.f697k = z0VarU.p(f.j.D1);
            this.f698l = z0VarU.p(f.j.E1);
            this.f699m = z0VarU.n(f.j.f23536w1, 0);
            this.f700n = c(z0VarU.o(f.j.F1));
            this.f701o = z0VarU.k(f.j.M1, 4096);
            this.f702p = c(z0VarU.o(f.j.G1));
            this.f703q = z0VarU.k(f.j.Q1, 4096);
            int i10 = f.j.H1;
            this.f704r = z0VarU.s(i10) ? z0VarU.a(i10, false) : this.f691e;
            this.f705s = z0VarU.a(f.j.f23551z1, false);
            this.f706t = z0VarU.a(f.j.A1, this.f692f);
            this.f707u = z0VarU.a(f.j.f23541x1, this.f693g);
            this.f708v = z0VarU.k(f.j.R1, -1);
            this.f712z = z0VarU.o(f.j.I1);
            this.f709w = z0VarU.n(f.j.J1, 0);
            this.f710x = z0VarU.o(f.j.L1);
            String strO = z0VarU.o(f.j.K1);
            this.f711y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f709w == 0 && this.f710x == null) {
                this.A = (androidx.core.view.b) e(strO, g.f679f, g.this.f681b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = z0VarU.p(f.j.N1);
            this.C = z0VarU.p(f.j.S1);
            int i11 = f.j.P1;
            if (z0VarU.s(i11)) {
                this.E = i0.d(z0VarU.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = f.j.O1;
            if (z0VarU.s(i12)) {
                this.D = z0VarU.c(i12);
            } else {
                this.D = null;
            }
            z0VarU.w();
            this.f694h = false;
        }

        public void h() {
            this.f688b = 0;
            this.f689c = 0;
            this.f690d = 0;
            this.f691e = 0;
            this.f692f = true;
            this.f693g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f678e = clsArr;
        f679f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f682c = context;
        Object[] objArr = {context};
        this.f680a = objArr;
        this.f681b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f683d == null) {
            this.f683d = a(this.f682c);
        }
        return this.f683d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof z.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f682c.getResources().getLayout(i10);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e5) {
                    throw new InflateException("Error inflating menu XML", e5);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
