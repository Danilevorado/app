package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
class r {

    /* renamed from: c, reason: collision with root package name */
    private static final r f20988c = new r(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f20989a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f20990b;

    private r(Long l10, TimeZone timeZone) {
        this.f20989a = l10;
        this.f20990b = timeZone;
    }

    static r c() {
        return f20988c;
    }

    Calendar a() {
        return b(this.f20990b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f20989a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
