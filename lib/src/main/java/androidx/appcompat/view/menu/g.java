package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g implements z.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f821a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f822b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f823c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f824d;

    /* renamed from: e, reason: collision with root package name */
    private a f825e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f833m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f834n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f835o;

    /* renamed from: p, reason: collision with root package name */
    View f836p;

    /* renamed from: x, reason: collision with root package name */
    private i f844x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f846z;

    /* renamed from: l, reason: collision with root package name */
    private int f832l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f837q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f838r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f839s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f840t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f841u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f842v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f843w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f845y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f826f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f827g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f828h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f829i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f830j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f831k = true;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f821a = context;
        this.f822b = context.getResources();
        b0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f826f.size()) {
            return;
        }
        this.f826f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f836p = view;
            this.f834n = null;
            this.f835o = null;
        } else {
            if (i10 > 0) {
                this.f834n = resourcesC.getText(i10);
            } else if (charSequence != null) {
                this.f834n = charSequence;
            }
            if (i11 > 0) {
                this.f835o = androidx.core.content.a.e(u(), i11);
            } else if (drawable != null) {
                this.f835o = drawable;
            }
            this.f836p = null;
        }
        K(false);
    }

    private void b0(boolean z10) {
        this.f824d = z10 && this.f822b.getConfiguration().keyboard != 1 && y.e(ViewConfiguration.get(this.f821a), this.f821a);
    }

    private i g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new i(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f843w.isEmpty()) {
            return;
        }
        d0();
        Iterator it = this.f843w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f843w.remove(weakReference);
            } else {
                mVar.e(z10);
            }
        }
        c0();
    }

    private boolean j(r rVar, m mVar) {
        if (this.f843w.isEmpty()) {
            return false;
        }
        boolean zD = mVar != null ? mVar.d(rVar) : false;
        Iterator it = this.f843w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null) {
                this.f843w.remove(weakReference);
            } else if (!zD) {
                zD = mVar2.d(rVar);
            }
        }
        return zD;
    }

    private static int n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((i) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f840t;
    }

    Resources C() {
        return this.f822b;
    }

    public g D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f828h) {
            return this.f827g;
        }
        this.f827g.clear();
        int size = this.f826f.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) this.f826f.get(i10);
            if (iVar.isVisible()) {
                this.f827g.add(iVar);
            }
        }
        this.f828h = false;
        this.f831k = true;
        return this.f827g;
    }

    public boolean F() {
        return this.f845y;
    }

    boolean G() {
        return this.f823c;
    }

    public boolean H() {
        return this.f824d;
    }

    void I(i iVar) {
        this.f831k = true;
        K(true);
    }

    void J(i iVar) {
        this.f828h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (this.f837q) {
            this.f838r = true;
            if (z10) {
                this.f839s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f828h = true;
            this.f831k = true;
        }
        i(z10);
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
  0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.i) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.r) r7
            if (r4 == 0) goto L63
            r2.e(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    public void O(m mVar) {
        Iterator it = this.f843w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f843w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f825e = aVar;
    }

    public g S(int i10) {
        this.f832l = i10;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f826f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) this.f826f.get(i10);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    protected g U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    protected g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected g X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    protected g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iB = B(i12);
        i iVarG = g(i10, i11, i12, iB, charSequence, this.f832l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f833m;
        if (contextMenuInfo != null) {
            iVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f826f;
        arrayList.add(n(arrayList, iB), iVarG);
        K(true);
        return iVarG;
    }

    public void a0(boolean z10) {
        this.f846z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f822b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f822b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f821a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f822b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f822b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i iVar = (i) a(i10, i11, i12, charSequence);
        r rVar = new r(this.f821a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f821a);
    }

    public void c(m mVar, Context context) {
        this.f843w.add(new WeakReference(mVar));
        mVar.c(context, this);
        this.f831k = true;
    }

    public void c0() {
        this.f837q = false;
        if (this.f838r) {
            this.f838r = false;
            K(this.f839s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.f844x;
        if (iVar != null) {
            f(iVar);
        }
        this.f826f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f835o = null;
        this.f834n = null;
        this.f836p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f825e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f837q) {
            return;
        }
        this.f837q = true;
        this.f838r = false;
        this.f839s = false;
    }

    public final void e(boolean z10) {
        if (this.f841u) {
            return;
        }
        this.f841u = true;
        Iterator it = this.f843w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f843w.remove(weakReference);
            } else {
                mVar.a(this, z10);
            }
        }
        this.f841u = false;
    }

    public boolean f(i iVar) {
        boolean zH = false;
        if (!this.f843w.isEmpty() && this.f844x == iVar) {
            d0();
            Iterator it = this.f843w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f843w.remove(weakReference);
                } else {
                    zH = mVar.h(this, iVar);
                    if (zH) {
                        break;
                    }
                }
            }
            c0();
            if (zH) {
                this.f844x = null;
            }
        }
        return zH;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f826f.get(i11);
            if (iVar.getItemId() == i10) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f826f.get(i10);
    }

    boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f825e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f846z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i) this.f826f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean zI = false;
        if (this.f843w.isEmpty()) {
            return false;
        }
        d0();
        Iterator it = this.f843w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f843w.remove(weakReference);
            } else {
                zI = mVar.i(this, iVar);
                if (zI) {
                    break;
                }
            }
        }
        c0();
        if (zI) {
            this.f844x = iVar;
        }
        return zI;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((i) this.f826f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((i) this.f826f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    i p(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f842v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean zG = G();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i10 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        i iVarP = p(i10, keyEvent);
        boolean zL = iVarP != null ? L(iVarP, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List list, int i10, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f826f.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = (i) this.f826f.get(i11);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i10 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f831k) {
            Iterator it = this.f843w.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f843w.remove(weakReference);
                } else {
                    zG |= mVar.g();
                }
            }
            if (zG) {
                this.f829i.clear();
                this.f830j.clear();
                int size = arrayListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = (i) arrayListE.get(i10);
                    (iVar.l() ? this.f829i : this.f830j).add(iVar);
                }
            } else {
                this.f829i.clear();
                this.f830j.clear();
                this.f830j.addAll(E());
            }
            this.f831k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iL = l(i10);
        if (iL >= 0) {
            int size = this.f826f.size() - iL;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((i) this.f826f.get(iL)).getGroupId() != i10) {
                    break;
                }
                N(iL, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList s() {
        r();
        return this.f829i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f826f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f826f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.t(z11);
                iVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f845y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f826f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f826f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f826f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f826f.get(i11);
            if (iVar.getGroupId() == i10 && iVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f823c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f826f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f821a;
    }

    public i v() {
        return this.f844x;
    }

    public Drawable w() {
        return this.f835o;
    }

    public CharSequence x() {
        return this.f834n;
    }

    public View y() {
        return this.f836p;
    }

    public ArrayList z() {
        r();
        return this.f830j;
    }
}
