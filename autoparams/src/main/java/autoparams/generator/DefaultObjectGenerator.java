package autoparams.generator;

import autoparams.customization.RecursionGuard;

final class DefaultObjectGenerator extends CompositeObjectGenerator {

    public DefaultObjectGenerator() {
        super(
            new RecursionGuard().customize(
                new CompositeObjectGenerator(
                    new ResolutionContextGenerator(),
                    new ExtensionContextGenerator(),
                    new PrimitiveValueGenerator(),
                    new RootGenerator(),
                    new ClassGenerator(),
                    new DefaultEmailAddressGenerationOptionsProvider(),
                    new EmailAddressStringGenerator(),
                    new UUIDGenerator(),
                    new NumberGenerator(),
                    new TimeGenerator(),
                    new EnumGenerator(),
                    new DefaultURLGenerationOptionsProvider(),
                    new URIGenerator(),
                    new URLGenerator(),
                    new StringGenerator(),
                    new CollectionGenerator(),
                    new StreamGenerator(),
                    new OptionalGenerator(),
                    new FactoryGenerator(),
                    new ServiceGenerator(),
                    new ComplexObjectGenerator()
                )
            )
        );
    }
}
