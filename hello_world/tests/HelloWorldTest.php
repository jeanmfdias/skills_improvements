<?php

declare(strict_types=1);

use PHPUnit\Framework\TestCase;

class HelloWorldTest extends TestCase
{
    public function testReturnsHelloWorld()
    {
        $helloWorld = new HelloWorld();
        $this->assertSame($helloWorld->show(), "Hello World");
    }
}