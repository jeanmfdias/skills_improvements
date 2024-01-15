<?php

declare(strict_types=1);

namespace Jean\HelloWorld;

class HelloWorld
{
    private string $helloWorld = "Hello World";

    public function show(): string
    {
        return $this->helloWorld;
    }
}