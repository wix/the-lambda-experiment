package org.wixpress.hoopoe.lambda;

/**
 * @author Yoav
 * @since 10/6/11
 */
public interface SelfDescribingFunction<R> {
    public Class<R> retType();
    public Class<?>[] varTypes();
}
