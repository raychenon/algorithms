#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
:copyright: (c) 2019 by Raymond Chenon
"""
import os
import sys

from setuptools import setup
from setuptools.command.install import install


# circleci.py version
VERSION = "1.1.1"

def readme():
    """print long description"""
    with open('README.md') as f:
        return f.read()


setup(
    name="circleci",
    description="Coding gym exercises written in Python",
    long_description=readme(),
    url="https://github.com/raychenon/algorithms",
    author="Raymond Chenon",
    classifiers=[
        "Intended Audience :: Developers",
        "Topic :: Software Development :: Coding challenge",
        "Programming Language :: Python :: 3",
        "Programming Language :: Python :: 3.6",
    ],
    keywords='circleci ci cd api sdk',
    packages=['circleci'],
    install_requires=[
        'requests==2.18.4',
    ],
    python_requires='>=3',
    cmdclass={
        'verify': VerifyVersionCommand,
    }
)
