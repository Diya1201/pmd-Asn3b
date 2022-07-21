/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex;

import net.sourceforge.pmd.lang.Language;
import net.sourceforge.pmd.lang.LanguageProcessor;
import net.sourceforge.pmd.lang.LanguagePropertyBundle;
import net.sourceforge.pmd.lang.LanguageRegistry;
import net.sourceforge.pmd.lang.impl.LanguageModuleWithOneVersion;

public class ApexLanguageModule extends LanguageModuleWithOneVersion {

    public static final String NAME = "Apex";
    public static final String TERSE_NAME = "apex";

    public ApexLanguageModule() {
        super(LanguageMetadata.withId(TERSE_NAME).name(NAME).extensions("cls", "trigger"));
    }

    @Override
    public ApexLanguageProperties newPropertyBundle() {
        return new ApexLanguageProperties(this);
    }

    @Override
    public LanguageProcessor createProcessor(LanguagePropertyBundle bundle) {
        return new ApexLanguageProcessor((ApexLanguageProperties) bundle);
    }

    public static Language getInstance() {
        return LanguageRegistry.PMD.getLanguageByFullName(NAME);
    }
}
