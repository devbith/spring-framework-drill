``What is a proxy object and what are the two different types of proxies Spring can create? 
What are the limitations of these proxies (per type)? What is the power of a proxy object and where are the disadvantages?``

Proxy Object is an object that adds additional logic on top of object that is being proxied without having to modify code of proxied object. 
Proxy object has the same public methods as object that is being proxied and it should be as much as possible indistinguishable from proxied object.
When method is invoked on Proxy Object, additional code, usually before and after sections are invoked, also code from proxied object is invoked by Proxy Object.

Proxy Advantages:

- Ability to change behavior of existing beans without changing original code 
- Separation of concerns (logging, transactions, security, ...)

Proxy Disadvantages:

- May create code hard to debug
- Needs to use unchecked exception for exceptions not declared in original method
- May cause performance issues if before/after section in proxy code is using IO (Network, Disk)
- May cause unexpected equals operator (==) results since Proxy Object and Proxied Object are two different objects


``What is a proxy object and what are the two different types of proxies Spring can create?
What are the limitations of these proxies (per type)? What is the power of a proxy object and where are the disadvantages?``


Spring Framework supports two kind of proxies:

- JDK Dynamic Proxy – used by default if target object implements interface
- CGLIB Proxy – use when target does not implement any interface

Limitations of JDK Dynamic Proxy:

- Requires proxy object to implement the interface 
- Only interface methods will be proxied 
- No support for self-invocation

Limitations of CGLIB Proxy:

- Does not work for final classes 
- Does not work for final methods
- No support for self-invocation