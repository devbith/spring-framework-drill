In standalone non-web application, we can close the application-context using the ``close()`` and
``registerShutdownHook()`` method or by opening application-context using ``try-with-resource``.

* Recommended way to close the application-context is by calling ``registerShutdownHook()``
