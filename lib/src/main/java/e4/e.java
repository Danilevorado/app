package e4;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Account f23112a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f23113b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23114c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f23115d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23116e;

    /* renamed from: f, reason: collision with root package name */
    private final View f23117f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23118g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23119h;

    /* renamed from: i, reason: collision with root package name */
    private final y4.a f23120i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f23121j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f23122a;

        /* renamed from: b, reason: collision with root package name */
        private q.b f23123b;

        /* renamed from: c, reason: collision with root package name */
        private String f23124c;

        /* renamed from: d, reason: collision with root package name */
        private String f23125d;

        /* renamed from: e, reason: collision with root package name */
        private final y4.a f23126e = y4.a.f28536k;

        public e a() {
            return new e(this.f23122a, this.f23123b, null, 0, null, this.f23124c, this.f23125d, this.f23126e, false);
        }

        public a b(String str) {
            this.f23124c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f23123b == null) {
                this.f23123b = new q.b();
            }
            this.f23123b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f23122a = account;
            return this;
        }

        public final a e(String str) {
            this.f23125d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i10, View view, String str, String str2, y4.a aVar, boolean z10) {
        this.f23112a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f23113b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f23115d = map;
        this.f23117f = view;
        this.f23116e = i10;
        this.f23118g = str;
        this.f23119h = str2;
        this.f23120i = aVar == null ? y4.a.f28536k : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
        this.f23114c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f23112a;
    }

    public Account b() {
        Account account = this.f23112a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f23114c;
    }

    public String d() {
        return this.f23118g;
    }

    public Set e() {
        return this.f23113b;
    }

    public final y4.a f() {
        return this.f23120i;
    }

    public final Integer g() {
        return this.f23121j;
    }

    public final String h() {
        return this.f23119h;
    }

    public final Map i() {
        return this.f23115d;
    }

    public final void j(Integer num) {
        this.f23121j = num;
    }
}
