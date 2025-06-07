package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03926v<E> extends AbstractC03916u<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC03916u<E> A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{6, 39, 28, 41, 24, 43, 32, 38, 37, -41, 32, 42, -41, 37, 38, 43, -41, 42, 44, 39, 39, 38, 41, 43, 28, 27, -41, 29, 38, 41, -41, 41, 28, 24, 27, -28, 38, 37, 35, 48, -41, 26, 38, 35, 35, 28, 26, 43, 32, 38, 37};
    }

    @Override // java.util.ListIterator
    public final void add(E e5) {
        throw new UnsupportedOperationException(A00(0, 51, 99));
    }

    @Override // java.util.ListIterator
    public final void set(E e5) {
        throw new UnsupportedOperationException(A00(0, 51, 99));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03926v(AbstractC03916u abstractC03916u, int i10) {
        super(abstractC03916u);
        this.A00 = abstractC03916u;
        AbstractC03916u.A02.A04(i10, abstractC03916u.size());
        A05(i10);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return getA00() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return getA00();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC03916u<E> abstractC03916u = this.A00;
            A05(getA00() - 1);
            return abstractC03916u.get(getA00());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getA00() - 1;
    }
}
