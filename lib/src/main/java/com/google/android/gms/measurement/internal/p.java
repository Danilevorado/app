package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p extends q5 {

    /* renamed from: c, reason: collision with root package name */
    private long f20253c;

    /* renamed from: d, reason: collision with root package name */
    private String f20254d;

    /* renamed from: e, reason: collision with root package name */
    private AccountManager f20255e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f20256f;

    /* renamed from: g, reason: collision with root package name */
    private long f20257g;

    p(w4 w4Var) {
        super(w4Var);
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.f20253c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f20254d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    final long m() {
        f();
        return this.f20257g;
    }

    public final long n() {
        i();
        return this.f20253c;
    }

    public final String o() {
        i();
        return this.f20254d;
    }

    final void p() {
        f();
        this.f20256f = null;
        this.f20257g = 0L;
    }

    final boolean q() throws OperationCanceledException, IOException, AuthenticatorException {
        f();
        long jA = this.f20269a.d().a();
        if (jA - this.f20257g > 86400000) {
            this.f20256f = null;
        }
        Boolean bool = this.f20256f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.a.a(this.f20269a.a(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f20269a.b().w().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f20255e == null) {
                this.f20255e = AccountManager.get(this.f20269a.a());
            }
            try {
                Account[] result = this.f20255e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f20256f = Boolean.TRUE;
                    this.f20257g = jA;
                    return true;
                }
                Account[] result2 = this.f20255e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f20256f = Boolean.TRUE;
                    this.f20257g = jA;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e5) {
                this.f20269a.b().r().b("Exception checking account types", e5);
            }
        }
        this.f20257g = jA;
        this.f20256f = Boolean.FALSE;
        return false;
    }
}
