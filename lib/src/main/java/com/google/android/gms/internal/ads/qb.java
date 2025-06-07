package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class qb extends cb {
    public qb(pb pbVar, SSLSocketFactory sSLSocketFactory) {
    }

    static List a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new fa((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
