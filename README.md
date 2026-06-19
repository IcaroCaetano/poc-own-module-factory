# poc-own-module-factory

````plantuml
poc-own-module-factory

src

factory-domain
|
├── module-info.java
└── com/project/factory/domain
    ├── Product.java
    └── ProductionOrder.java


factory-service
|
├── module-info.java
└── com/project/factory/service
    └── ProductionService.java


factory-app
|
├── module-info.java
└── com/project/factory/app
    └── FactoryApplication.java
````

## O que é o module-info.java?

É um arquivo de configuração que define um módulo Java.

Ele descreve:

o nome do módulo;
quais pacotes ele expõe (exports);
de quais outros módulos ele depende (requires);
quais serviços ele fornece (provides);
quais serviços ele consome (uses).

Pense nele como um contrato público do módulo.