# SOLID
Object Oriented Design Principles - SOLID

Packages :

    initial : the initial low cohesion / high coupling code

    srp_first : removing CRUD operations responsibility from Employee class
    src_second : removing email validation responsibility from Employee class
    srp_third : removing message sending responsibility from Employee class

    ocp_first : creating abstraction for Employee repository
    ocp_second :

    lsp_repository : adding strengthened precondition in FileEmployeeRepository

    isp_settings_first : adding application/system settings repositories
    isp_settings_second : segregation of the fat settings repository interface

    dip_first/second : creating abstractions on which higher-lever modules/classes depend
                       hardwiring resources replaced with constructor dependency injection

                       
