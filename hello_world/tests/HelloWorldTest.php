<?php

declare(strict_types=1);

use Jean\HelloWorld\HelloWorld;
use PHPUnit\Framework\TestCase;

class HelloWorldTest extends TestCase
{
    public function testReturnsHelloWorld()
    {
        $helloWorld = new HelloWorld();
        $this->assertSame("Hello World", $helloWorld->show());
    }
}