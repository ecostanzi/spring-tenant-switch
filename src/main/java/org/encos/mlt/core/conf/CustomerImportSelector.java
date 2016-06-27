package org.encos.mlt.core.conf;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @author Enrico Costanzi
 */
class CustomerImportSelector implements ImportSelector, EnvironmentAware {

    private static final String PACKAGE = "org.encos.mlt.%s";
    private static final String CONFIG_CLASS = "CustomerConfig";

    private Environment env;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String customer = env.getProperty("mlt.customer");
        if(!StringUtils.isEmpty(customer)){
            return new String[] { String.format(PACKAGE, customer) + "." + CONFIG_CLASS };
        } else{
            return new String[]{};
        }

    }

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }
}